package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @TableName t_menu
 */
@Data
@TableName(value ="t_menu")
@ApiModel(value = "菜单实体类", description = "")
public class Menu implements Serializable {

    @ApiModelProperty(value = "id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "url")
    private String url;

    @ApiModelProperty(value = "path")
    private String path;

    @ApiModelProperty(value = "组件")
    private String component;

    @ApiModelProperty(value = "菜单名")
    private String name;

    @ApiModelProperty(value = "图标")
    private String iconcls;

    @ApiModelProperty(value = "是否保持激活")
    private Integer keepalive;

    @ApiModelProperty(value = "是否要求权限")
    private Integer requireauth;

    @ApiModelProperty(value = "父id")
    private Integer parentid;

    @ApiModelProperty(value = "是否启用")
    private Integer enabled;

    @ApiModelProperty(value = "子菜单")
    @TableField(exist = false)
    private List<Menu> children;

    @ApiModelProperty(value = "角色列表")
    @TableField(exist = false)
    private List<Role> roles;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}