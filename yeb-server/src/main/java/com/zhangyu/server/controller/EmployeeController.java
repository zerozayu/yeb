package com.zhangyu.server.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.zhangyu.server.pojo.*;
import com.zhangyu.server.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.val;
import org.apache.poi.ss.formula.functions.Na;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
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
        return employeeService.getEmployeeByPage(currentPage, size, employee, beginDateScope);
    }

    @ApiOperation(value = "获取所有的政治面貌")
    @GetMapping("/politcsstatus")
    public List<PoliticsStatus> getAllPoliticsStatus() {
        return politicsStatusService.list();
    }

    @ApiOperation(value = "获取所有职称")
    @GetMapping("/joblevels")
    public List<Joblevel> getAllJobLevel() {
        return joblevelService.list();
    }

    @ApiOperation(value = "获取所有的民族")
    @GetMapping("/nations")
    public List<Nation> getAllNations() {
        return nationService.list();
    }

    @ApiOperation(value = "获取所有的职位")
    @GetMapping("/positions")
    public List<Position> getAllPositions() {
        return positionService.list();
    }

    @ApiOperation(value = "获取所有部门")
    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @ApiOperation(value = "获取工号")
    @GetMapping("/maxWorkId")
    public RespBean getMaxWordId() {
        return employeeService.getMaxWordId();
    }

    @ApiOperation(value = "添加员工")
    @PostMapping("/")
    public RespBean addEmp(@RequestBody Employee employee) {
        return employeeService.addEmp(employee);
    }

    @ApiOperation(value = "更新员工信息")
    @PutMapping("/")
    public RespBean updateEmp(@RequestBody Employee employee) {
        if (employeeService.updateById(employee)) {
            return RespBean.success("更新员工成功");
        }
        return RespBean.error("更新员工失败");
    }

    @ApiOperation(value = "删除员工")
    @DeleteMapping("/{id}")
    public RespBean deleteEmp(@PathVariable Integer id) {
        if (employeeService.removeById(id)) {
            return RespBean.success("删除员工成功");
        }
        return RespBean.error("删除员工失败");
    }

    @ApiOperation(value = "导出员工数据")
    @GetMapping(value = "/export", produces = "application/octet-stream")
    public void exportEmployee(HttpServletResponse response) {
        List<Employee> list = employeeService.getEmployee(null);
        ExportParams params = new ExportParams("员工表", "员工表", ExcelType.HSSF);
        Workbook sheets = ExcelExportUtil.exportExcel(params, Employee.class, list);
        ServletOutputStream outputStream = null;
        try {
            response.setHeader("content-type", "application/octet-stream");
            response.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode("员工表.xls", "UTF-8"));
            outputStream = response.getOutputStream();
            sheets.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @ApiOperation(value = "导入员工数据")
    @PostMapping(value = "/import")
    public RespBean importEmployee(@RequestPart MultipartFile file){
        ImportParams params = new ImportParams();
        // 去掉标题行
        params.setTitleRows(1);
        List<Nation> nationList = nationService.list();
        List<PoliticsStatus> politicsStatusList = politicsStatusService.list();
        List<Department> departmentList = departmentService.list();
        List<Joblevel> joblevelList = joblevelService.list();
        List<Position> positionList = positionService.list();

        try {
            List<Employee> list = ExcelImportUtil.importExcel(file.getInputStream(), Employee.class, params);
            list.forEach(employee ->  {
                // 民族id
                employee.setNationid(nationList.get(nationList.indexOf(new Nation(employee.getNation().getName()))).getId());
                // 政治面貌id
                employee.setPoliticid(politicsStatusList.get(politicsStatusList.indexOf(new PoliticsStatus(employee.getPoliticsStatus().getName()))).getId());
                // 部门id
                employee.setDepartmentid(departmentList.get(departmentList.indexOf(new Department(employee.getDepartment().getName()))).getId());
                // 职称id
                employee.setJoblevelid(joblevelList.get(joblevelList.indexOf(new Joblevel(employee.getJoblevel().getName()))).getId());
                // 职位id
                employee.setPosid(positionList.get(positionList.indexOf(new Position(employee.getPosition().getName()))).getId());
            });
            if (employeeService.saveBatch(list)){
                return RespBean.success("导入员工数据成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return RespBean.error("导入员工数据失败");
    }

}
