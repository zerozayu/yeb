package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Employee;
import com.zhangyu.server.service.EmployeeService;
import com.zhangyu.server.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_employee】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee>
    implements EmployeeService{

}




