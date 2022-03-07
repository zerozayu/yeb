package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Role;
import com.zhangyu.server.service.RoleService;
import com.zhangyu.server.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_role】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




