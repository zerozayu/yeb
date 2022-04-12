package com.zhangyu.server.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @TableName t_position
 */
@ApiModel(value = "职位信息", description = "实现了UserDetails")
@Data
@EqualsAndHashCode(of = "name")
@RequiredArgsConstructor
@NoArgsConstructor
@TableName(value ="t_position")
public class Position implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "职位")
    @Excel(name = "职位")
    @NonNull
    private String name;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    private LocalDateTime createdate;

    @ApiModelProperty(value = "是否启用")
    private Integer enabled;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}