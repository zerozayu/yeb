package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.Department;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 部门管理
 *
 * @author zhangyu
 * @date 2022/4/8 15:31
 */
@Api(tags = "DepartmentController")
@RestController
@RequestMapping("/system/basic/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "获取所有部门")
    @GetMapping("/")
    public List<Department> getAllDepartment(){
        return departmentService.getAllDepartments();
    }

    @ApiOperation(value = "添加部门")
    @PutMapping("/")
    public RespBean addDepartment(@RequestBody Department dep){
        return departmentService.addDep(dep);
    }

    @ApiOperation(value = "删除部门")
    @DeleteMapping("/{id}")
    public RespBean deleteDepartment(@PathVariable Integer id){
        return departmentService.deleteDep(id);
    }
}
