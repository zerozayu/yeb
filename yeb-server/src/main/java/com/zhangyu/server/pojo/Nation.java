package com.zhangyu.server.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * 
 * @TableName t_nation
 */
@TableName(value ="t_nation")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "name")
public class Nation implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "民族")
    @Excel(name = "民族")
    @NonNull
    private String name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}