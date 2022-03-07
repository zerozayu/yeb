package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Admin;
import com.zhangyu.server.service.AdminService;
import com.zhangyu.server.mapper.AdminMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_admin】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin>
    implements AdminService{

}




