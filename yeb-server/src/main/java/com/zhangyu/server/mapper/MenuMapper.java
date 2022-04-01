package com.zhangyu.server.mapper;

import com.zhangyu.server.pojo.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_menu】的数据库操作Mapper
* @createDate 2022-03-07 21:17:10
* @Entity com.zhangyu.server.pojo.Menu
*/
public interface MenuMapper extends BaseMapper<Menu> {

    /**
     * 通过用户id查询菜单列表
     * @param id
     * @return
     */
    List<Menu> getMenusByAdminId(Integer id);
}




