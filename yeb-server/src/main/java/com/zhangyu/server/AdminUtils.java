package com.zhangyu.server;

import com.zhangyu.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * 操作员工具类
 *
 * @author zhangyu
 * @date 2022/4/8 23:16
 */
public class AdminUtils {
    public static Admin getCurrentAdmin(){
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
