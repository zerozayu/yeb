package com.zhangyu.server.mapper;

import com.zhangyu.server.pojo.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_role】的数据库操作Mapper
* @createDate 2022-03-07 21:17:10
* @Entity com.zhangyu.server.pojo.Role
*/
public interface RoleMapper extends BaseMapper<Role> {

    List<Role> getRoles(Integer adminId);
}




