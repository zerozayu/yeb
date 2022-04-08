package com.zhangyu.server.service;

import com.zhangyu.server.pojo.Department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_department】的数据库操作Service
* @createDate 2022-03-07 21:17:10
*/
public interface DepartmentService extends IService<Department> {

    /**
     * 获取所有部门
     * @return
     */
    List<Department> getAllDepartments();
}
