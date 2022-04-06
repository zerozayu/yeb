package com.zhangyu.server.exception;

import com.zhangyu.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 *
 * @author zhangyu
 * @date 2022/4/5 11:58
 */
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLException.class)
    public RespBean mySqlException(SQLException e){
        if (e instanceof SQLIntegrityConstraintViolationException){
            return RespBean.error("违反了完整性约束（外键、主键或唯一键");
        }
        return RespBean.error("数据库异常，操作失败");
    }
}
