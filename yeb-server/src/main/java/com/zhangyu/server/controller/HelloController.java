package com.zhangyu.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author zhangyu
 * @date 2022/3/10 11:06 PM
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
