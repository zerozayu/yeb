package com.zhangyu.server.controller;

import com.zhangyu.server.pojo.Admin;
import com.zhangyu.server.pojo.AdminLoginParam;
import com.zhangyu.server.pojo.RespBean;
import com.zhangyu.server.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * 登录
 *
 * @author zhangyu
 * @date 2022/3/8 10:28 PM
 */
@Api(tags = "LoginController")
@RestController
public class LoginController {
    private final AdminService adminService;

    public LoginController(AdminService adminService) {
        this.adminService = adminService;
    }


    @ApiOperation(value = "登录之后返回token")
    @PostMapping("/login")
    public RespBean login(@RequestBody AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword(), request);
    }

    @ApiOperation(value = "获取当前登录用户的信息")
    @PostMapping("/admin/info")
    public Admin getAdminInfo(Principal principal){
        if (null == principal){
            return null;
        }
        // Principal就是登录之后设置到全局的当前登录对象
        String username = principal.getName();
        Admin admin = adminService.getAdminByUserName(username);
        admin.setPassword(null);
        return admin;
    }

    @ApiOperation(value = "退出登录")
    @PostMapping("/logout")
    public RespBean logout(){
        return RespBean.success("注销成功");
    }
}
