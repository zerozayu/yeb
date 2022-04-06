package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.MenuRole;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.MenuRoleService;
import com.zhangyu.server.mapper.MenuRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangyu
 * @description 针对表【t_menu_role】的数据库操作Service实现
 * @createDate 2022-03-07 21:17:10
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole>
        implements MenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * 先把所有的菜单删除，再根据mids更新相应的菜单列表
     *
     * @param rid
     * @param mids
     * @return
     */
    @Override
    @Transactional
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));
        if (null == mids || mids.length == 0){
            return RespBean.success("更新角色菜单成功");
        }
        Integer successCount = menuRoleMapper.insertRecord(rid, mids);
        if (successCount == mids.length){
            return RespBean.success("更新角色菜单成功");
        }
        return RespBean.error("更新角色菜单失败");
    }
}




