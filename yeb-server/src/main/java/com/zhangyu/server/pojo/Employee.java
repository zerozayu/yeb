package com.zhangyu.server.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @TableName t_employee
 */
@Data
@ApiModel(value = "Employee", description = "员工信息")
@TableName(value = "t_employee")
public class Employee implements Serializable {

    @ApiModelProperty(value = "员工编号")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "员工姓名")
    @Excel(name = "员工姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    @Excel(name = "性别")
    private String gender;

    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Excel(name = "出生日期", width = 20, format = "yyyy-MM-dd")
    private LocalDate birthday;

    @ApiModelProperty(value = "身份证号")
    @Excel(name = "身份证号", width = 30)
    private String idcard;

    @ApiModelProperty(value = "婚姻状况")
    @Excel(name = "婚姻状况")
    private Object wedlock;

    @ApiModelProperty(value = "民族")
    private Integer nationid;

    @ApiModelProperty(value = "籍贯")
    @Excel(name = "籍贯")
    private String nativeplace;

    @ApiModelProperty(value = "政治面貌")
    private Integer politicid;

    @ApiModelProperty(value = "邮箱")
    @Excel(name = "邮箱", width = 30)
    private String email;

    @ApiModelProperty(value = "电话号码")
    @Excel(name = "电话号码", width = 15)
    private String phone;

    @ApiModelProperty(value = "联系地址")
    @Excel(name = "联系地址", width = 40)
    private String address;

    @ApiModelProperty(value = "所属部门")
    private Integer departmentid;

    @ApiModelProperty(value = "职称ID")
    private Integer joblevelid;

    @ApiModelProperty(value = "职位ID")
    private Integer posid;

    @ApiModelProperty(value = "聘用形式")
    @Excel(name = "聘用形式")
    private String engageform;

    @ApiModelProperty(value = "最高学历")
    @Excel(name = "最高学历")
    private Object tiptopdegree;

    @ApiModelProperty(value = "所属专业")
    @Excel(name = "所属专业")
    private String specialty;

    @ApiModelProperty(value = "毕业院校")
    @Excel(name = "毕业院校", width = 20)
    private String school;

    @ApiModelProperty(value = "入职日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Excel(name = "入职日期", width = 20, format = "yyyy-MM-dd")
    private LocalDate begindate;

    @ApiModelProperty(value = "在职状态")
    @Excel(name = "在职状态")
    private Object workstate;

    @ApiModelProperty(value = "工号")
    @Excel(name = "工号")
    private String workid;

    @ApiModelProperty(value = "合同期限")
    @Excel(name = "合同期限")
    private Double contractterm;

    @ApiModelProperty(value = "转正日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Excel(name = "转正日期", width = 20, format = "yyyy-MM-dd")
    private LocalDate conversiontime;

    @ApiModelProperty(value = "离职日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Excel(name = "离职日期", width = 20, format = "yyyy-MM-dd")
    private LocalDate notworkdate;

    @ApiModelProperty(value = "合同起始日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Excel(name = "合同起始日期", width = 20, format = "yyyy-MM-dd")
    private LocalDate begincontract;

    @ApiModelProperty(value = "合同终止日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    @Excel(name = "合同终止日期", width = 20, format = "yyyy-MM-dd")
    private LocalDate endcontract;

    @ApiModelProperty(value = "工龄")
    @Excel(name = "工龄")
    private Integer workage;

    @ApiModelProperty(value = "工资账套ID")
    private Integer salaryid;

    @ApiModelProperty(value = "民族")
    @TableField(exist = false)
    @ExcelEntity(name = "民族")
    private Nation nation;

    @ApiModelProperty(value = "政治面貌")
    @TableField(exist = false)
    @ExcelEntity(name = "政治面貌")
    private PoliticsStatus politicsStatus;

    @ApiModelProperty(value = "部门")
    @TableField(exist = false)
    @ExcelEntity(name = "部门")
    private Department department;

    @ApiModelProperty(value = "职称")
    @TableField(exist = false)
    @ExcelEntity(name = "职称")
    private Joblevel joblevel;

    @ApiModelProperty(value = "职位")
    @TableField(exist = false)
    @ExcelEntity(name = "职位")
    private Position position;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}