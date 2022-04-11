package com.zhangyu.server.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * 
 * @TableName t_politics_status
 */
@Data
@TableName(value ="t_politics_status")
public class PoliticsStatus implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;


    @ApiModelProperty(value = "政治面貌")
    @Excel(name = "政治面貌")
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}