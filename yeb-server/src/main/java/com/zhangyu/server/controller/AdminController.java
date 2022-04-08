package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.Admin;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 操作员controller
 *
 * @author zhangyu
 * @date 2022/4/8 23:08
 */
@Api(tags = "AdminController")
@RestController
@RequestMapping("/system/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "获取所有操作员")
    @GetMapping("/")
    public List<Admin> getAllAdmin(@RequestParam String keywords){
        return adminService.getAllAdmin(keywords);
    }

    @ApiOperation(value = "更新操作员")
    @PutMapping("/")
    public RespBean updateAdmin(@RequestBody Admin admin){
        if (adminService.updateById(admin)){
            return RespBean.success("更新操作员成功");
        }
        return RespBean.error("更新操作员失败");
    }

    @ApiOperation(value = "删除操作员")
    @DeleteMapping("/{id}")
    public RespBean deleteAdmin(@PathVariable Integer id){
        if (adminService.removeById(id)){
            return RespBean.success("删除操作员成功");
        }
        return RespBean.error("删除操作员失败");
    }
}
