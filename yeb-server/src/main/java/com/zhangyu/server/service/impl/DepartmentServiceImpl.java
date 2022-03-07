package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Department;
import com.zhangyu.server.service.DepartmentService;
import com.zhangyu.server.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_department】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




