package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.AdminUtils;
import com.zhangyu.server.config.security.component.JwtTokenUtils;
import com.zhangyu.server.mapper.AdminRoleMapper;
import com.zhangyu.server.mapper.RoleMapper;
import com.zhangyu.server.pojo.Admin;
import com.zhangyu.server.pojo.AdminRole;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.pojo.Role;
import com.zhangyu.server.service.AdminService;
import com.zhangyu.server.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangyu
 * @description 针对表【t_admin】的数据库操作Service实现
 * @createDate 2022-03-07 21:17:10
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
        implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AdminRoleMapper adminRoleMapper;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtils jwtTokenUtils;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    /**
     * 登录之后返回token
     *
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    @Override
    public RespBean login(String username, String password, String code, HttpServletRequest request) {
        String captcha = (String) request.getSession().getAttribute("captcha");
        if (StringUtils.isEmpty(captcha) || !captcha.equalsIgnoreCase(code)){
            return RespBean.error("验证码输入错误，请重新输入！");
        }
        // 登录
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if (userDetails == null || !passwordEncoder.matches(password, userDetails.getPassword())) {
            return RespBean.error("用户名或密码不正确");
        }
        if (!userDetails.isEnabled()) {
            return RespBean.error("账号被禁用，请联系管理员");
        }

        // 更新security登录用户对象(密码一般不放)
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        // 把登录的用户 放到security的全局里面
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);

        // 生成token
        String token = jwtTokenUtils.generateToken(userDetails);
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return RespBean.success("登录成功", tokenMap);
    }

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    @Override
    public Admin getAdminByUserName(String username) {
        return adminMapper.selectOne(new QueryWrapper<Admin>()
                .eq("username", username)
                .eq("enabled", 1));
    }

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    @Override
    public List<Role> getRoles(Integer adminId) {
        return roleMapper.getRoles(adminId);
    }

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
    @Override
    public List<Admin> getAllAdmin(String keywords) {
        return adminMapper.getAllAdmin(AdminUtils.getCurrentAdmin().getId(), keywords);
    }

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateAdminRole(Integer adminId, Integer[] rids) {
        adminRoleMapper.delete(new QueryWrapper<AdminRole>().eq("adminId", adminId));
        Integer result = adminRoleMapper.addAdminRole(adminId, rids);
        if (rids.length == result){
            return RespBean.success("更新操作员角色成功");
        }
        return RespBean.error("更新操作员角色失败");
    }


}




