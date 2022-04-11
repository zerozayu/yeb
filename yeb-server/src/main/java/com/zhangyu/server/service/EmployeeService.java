package com.zhangyu.server.service;

import com.zhangyu.server.pojo.Employee;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangyu.server.pojo.RespPageBean;

import java.time.LocalDate;

/**
* @author zhangyu
* @description 针对表【t_employee】的数据库操作Service
* @createDate 2022-03-07 21:17:10
*/
public interface EmployeeService extends IService<Employee> {

    /**
     * 获取所有员工信息（分页）
     * @param currentPage
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
    RespPageBean getEmployee(Integer currentPage, Integer size, Employee employee, LocalDate[] beginDateScope);
}
