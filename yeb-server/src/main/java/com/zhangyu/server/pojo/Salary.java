package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_salary
 */
@Data
@TableName(value ="t_salary")
public class Salary implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 基本工资
     */
    private Integer basicsalary;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 午餐补助
     */
    private Integer lunchsalary;

    /**
     * 交通补助
     */
    private Integer trafficsalary;

    /**
     * 应发工资
     */
    private Integer allsalary;

    /**
     * 养老金基数
     */
    private Integer pensionbase;

    /**
     * 养老金比率
     */
    private Double pensionper;

    /**
     * 启用时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private Date createdate;

    /**
     * 医疗基数
     */
    private Integer medicalbase;

    /**
     * 医疗保险比率
     */
    private Double medicalper;

    /**
     * 公积金基数
     */
    private Integer accumulationfundbase;

    /**
     * 公积金比率
     */
    private Double accumulationfundper;

    /**
     * 名称
     */
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}