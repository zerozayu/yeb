package com.zhangyu.server.mapper;

import com.zhangyu.server.pojo.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author zhangyu
* @description 针对表【t_department】的数据库操作Mapper
* @createDate 2022-03-07 21:17:10
* @Entity com.zhangyu.server.pojo.Department
*/
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 获取所有部d
     * @return
     */
    List<Department> getAllDepartments(Integer parentID);
}




