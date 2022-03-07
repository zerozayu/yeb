package com.zhangyu.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangyu.server.pojo.Salary;
import com.zhangyu.server.service.SalaryService;
import com.zhangyu.server.mapper.SalaryMapper;
import org.springframework.stereotype.Service;

/**
* @author zhangyu
* @description 针对表【t_salary】的数据库操作Service实现
* @createDate 2022-03-07 21:17:10
*/
@Service
public class SalaryServiceImpl extends ServiceImpl<SalaryMapper, Salary>
    implements SalaryService{

}




