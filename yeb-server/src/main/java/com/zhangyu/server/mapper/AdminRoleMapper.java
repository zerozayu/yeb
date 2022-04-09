package com.zhangyu.server.mapper;

import com.zhangyu.server.pojo.AdminRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author zhangyu
* @description 针对表【t_admin_role】的数据库操作Mapper
* @createDate 2022-03-07 21:17:10
* @Entity com.zhangyu.server.pojo.AdminRole
*/
public interface AdminRoleMapper extends BaseMapper<AdminRole> {



    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     */
    Integer addAdminRole(Integer adminId, Integer[] rids);
}




