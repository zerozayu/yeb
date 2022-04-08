package com.zhangyu.server.service;

import com.zhangyu.server.pojo.Admin;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.pojo.Role;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_admin】的数据库操作Service
* @createDate 2022-03-07 21:17:10
*/
public interface AdminService extends IService<Admin> {

    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param code
     * @param request
     * @return
     */
    RespBean login(String username, String password, String code, HttpServletRequest request);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Admin getAdminByUserName(String username);

    /**
     * 根据用户id查询角色列表
     * @param adminId
     * @return
     */
    List<Role> getRoles(Integer adminId);

    /**
     * 获取所有操作员
     * @param keywords
     * @return
     */
    List<Admin> getAllAdmin(String keywords);
}
