package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @TableName t_menu
 */
@Data
@TableName(value ="t_menu")
public class Menu implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * url
     */
    private String url;

    /**
     * path
     */
    private String path;

    /**
     * 组件
     */
    private String component;

    /**
     * 菜单名
     */
    private String name;

    /**
     * 图标
     */
    private String iconcls;

    /**
     * 是否保持激活
     */
    private Integer keepalive;

    /**
     * 是否要求权限
     */
    private Integer requireauth;

    /**
     * 父id
     */
    private Integer parentid;

    /**
     * 是否启用
     */
    private Integer enabled;

    @TableField(exist = false)
    private List<Menu> children;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}