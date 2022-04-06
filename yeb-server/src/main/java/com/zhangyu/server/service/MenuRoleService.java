package com.zhangyu.server.service;

import com.zhangyu.server.pojo.MenuRole;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangyu.server.pojo.RespBean;

/**
* @author zhangyu
* @description 针对表【t_menu_role】的数据库操作Service
* @createDate 2022-03-07 21:17:10
*/
public interface MenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
