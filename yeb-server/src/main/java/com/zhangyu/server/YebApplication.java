package com.zhangyu.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyu
 * @date 2022/3/2 8:42 PM
 */
@SpringBootApplication
@MapperScan("com.zhangyu.mapper")
public class YebApplication {
    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class, args);
    }
}
