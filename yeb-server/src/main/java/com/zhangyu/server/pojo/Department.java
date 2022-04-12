package com.zhangyu.server.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * 
 * @TableName t_department
 */
@Data
@ApiModel(value = "Department实体类", description = "")
@TableName(value ="t_department")
@EqualsAndHashCode(of = "name")
@RequiredArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "部门名称")
    @Excel(name = "部门")
    @NonNull
    private String name;

    @ApiModelProperty(value = "父id")
    private Integer parentid;

    @ApiModelProperty(value = "路径")
    private String deppath;

    @ApiModelProperty(value = "是否启用")
    private Integer enabled;

    @ApiModelProperty(value = "是否上级")
    private Integer isparent;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "子部门列表")
    @TableField(exist = false)
    private List<Department> children;

    @ApiModelProperty(value = "返回结果，存储过程使用")
    @TableField(exist = false)
    private Integer result;
}