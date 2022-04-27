package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.Salary;
import com.zhangyu.server.service.SalaryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 工资帐套
 *
 * @author zhangyu
 * @date 2022/4/27 16:15
 */
@RestController
@RequestMapping(value = "/salary/sob/")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @ApiOperation(value = "获取所有工资帐套")
    @GetMapping("/")
    public List<Salary> getAllSalary(){
        return salaryService.list();
    }
}
