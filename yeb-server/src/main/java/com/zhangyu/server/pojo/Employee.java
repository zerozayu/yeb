package com.zhangyu.server.pojo;

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
    private String name;

    @ApiModelProperty(value = "性别")
    private String gender;

    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate birthday;

    @ApiModelProperty(value = "身份证号")
    private String idcard;

    @ApiModelProperty(value = "婚姻状况")
    private Object wedlock;

    @ApiModelProperty(value = "民族")
    private Integer nationid;

    @ApiModelProperty(value = "籍贯")
    private String nativeplace;

    @ApiModelProperty(value = "政治面貌")
    private Integer politicid;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "联系地址")
    private String address;

    @ApiModelProperty(value = "所属部门")
    private Integer departmentid;

    @ApiModelProperty(value = "职称ID")
    private Integer joblevelid;

    @ApiModelProperty(value = "职位ID")
    private Integer posid;

    @ApiModelProperty(value = "聘用形式")
    private String engageform;

    @ApiModelProperty(value = "最高学历")
    private Object tiptopdegree;

    @ApiModelProperty(value = "所属专业")
    private String specialty;

    @ApiModelProperty(value = "毕业院校")
    private String school;

    @ApiModelProperty(value = "入职日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate begindate;

    @ApiModelProperty(value = "在职状态")
    private Object workstate;

    @ApiModelProperty(value = "工号")
    private String workid;

    @ApiModelProperty(value = "合同期限")
    private Double contractterm;

    @ApiModelProperty(value = "转正日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate conversiontime;

    @ApiModelProperty(value = "离职日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate notworkdate;

    @ApiModelProperty(value = "合同起始日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate begincontract;

    @ApiModelProperty(value = "合同终止日期")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDate endcontract;

    @ApiModelProperty(value = "工龄")
    private Integer workage;

    @ApiModelProperty(value = "工资账套ID")
    private Integer salaryid;

    @ApiModelProperty(value = "民族")
    @TableField(exist = false)
    private Nation nation;

    @ApiModelProperty(value = "政治面貌")
    @TableField(exist = false)
    private PoliticsStatus politicsStatus;

    @ApiModelProperty(value = "部门")
    @TableField(exist = false)
    private Department department;

    @ApiModelProperty(value = "职称")
    @TableField(exist = false)
    private Joblevel joblevel;

    @ApiModelProperty(value = "职位")
    @TableField(exist = false)
    private Position position;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}