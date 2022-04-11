package com.zhangyu.server.pojo;

import cn.afterturn.easypoi.excel.annotation.ExcelEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_nation
 */
@TableName(value ="t_nation")
@Data
public class Nation implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "民族")
    @ExcelEntity(name = "民族")
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}