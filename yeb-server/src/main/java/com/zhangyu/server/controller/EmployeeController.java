package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.*;
import com.zhangyu.server.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工controller
 *
 * @author zhangyu
 * @date 2022/4/10 14:48
 */
@Api(tags = "EmployeeController")
@RestController
@RequestMapping("/employee/basic")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private PoliticsStatusService politicsStatusService;
    @Autowired
    private JoblevelService joblevelService;
    @Autowired
    private NationService nationService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "获取所有员工信息（分页）")
    @GetMapping("/")
    public RespPageBean getEmployee(@RequestParam(defaultValue = "1") Integer currentPage,
                                    @RequestParam(defaultValue = "10") Integer size,
                                    Employee employee,
                                    LocalDate[] beginDateScope) {
        return employeeService.getEmployee(currentPage, size, employee, beginDateScope);
    }

    @ApiOperation(value = "获取所有的政治面貌")
    @GetMapping("/politcsstatus")
    public List<PoliticsStatus> getAllPoliticsStatus(){
        return politicsStatusService.list();
    }

    @ApiOperation(value = "获取所有职称")
    @GetMapping("/joblevels")
    public List<Joblevel> getAllJobLevel(){
        return joblevelService.list();
    }

    @ApiOperation(value = "获取所有的民族")
    @GetMapping("/nations")
    public List<Nation> getAllNations(){
        return nationService.list();
    }

    @ApiOperation(value = "获取所有的职位")
    @GetMapping("/positions")
    public List<Position> getAllPositions(){
        return positionService.list();
    }

    @ApiOperation(value = "获取所有部门")
    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @ApiOperation(value = "获取工号")
    @GetMapping("/maxWorkId")
    public RespBean getMaxWordId(){
        return employeeService.getMaxWordId();
    }

    @ApiOperation(value = "添加员工")
    @PostMapping("/")
    public RespBean addEmp(@RequestBody Employee employee){
        return employeeService.addEmp(employee);
    }

    @ApiOperation(value = "更新员工信息")
    @PutMapping("/")
    public RespBean updateEmp(@RequestBody Employee employee){
        if (employeeService.updateById(employee)){
            return RespBean.success("更新员工成功");
        }
        return RespBean.error("更新员工失败");
    }

    @ApiOperation(value = "删除员工")
    @DeleteMapping("/{id}")
    public RespBean deleteEmp(@PathVariable Integer id){
        if (employeeService.removeById(id)){
            return RespBean.success("删除员工成功");
        }
        return RespBean.error("删除员工失败");
    }

}
