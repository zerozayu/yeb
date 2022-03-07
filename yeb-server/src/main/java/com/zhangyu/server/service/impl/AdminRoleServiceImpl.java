package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.AdminRole;
import com.zhangyu.server.service.AdminRoleService;
import com.zhangyu.server.mapper.AdminRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_admin_role】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole>
    implements AdminRoleService{

}




