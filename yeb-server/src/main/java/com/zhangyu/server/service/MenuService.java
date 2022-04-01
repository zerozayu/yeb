package com.zhangyu.server.service;

import com.zhangyu.server.pojo.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_menu】的数据库操作Service
* @createDate 2022-03-07 21:17:10
*/
public interface MenuService extends IService<Menu> {

    /**
     * 通过用户id查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();
}
