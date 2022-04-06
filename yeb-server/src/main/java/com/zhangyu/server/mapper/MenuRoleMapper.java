package com.zhangyu.server.mapper;

import com.zhangyu.server.pojo.MenuRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author zhangyu
* @description 针对表【t_menu_role】的数据库操作Mapper
* @createDate 2022-03-07 21:17:10
* @Entity com.zhangyu.server.pojo.MenuRole
*/
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}




