package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName t_menu
 */
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
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * url
     */
    public String getUrl() {
        return url;
    }

    /**
     * url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * path
     */
    public String getPath() {
        return path;
    }

    /**
     * path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 组件
     */
    public String getComponent() {
        return component;
    }

    /**
     * 组件
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * 菜单名
     */
    public String getName() {
        return name;
    }

    /**
     * 菜单名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 图标
     */
    public String getIconcls() {
        return iconcls;
    }

    /**
     * 图标
     */
    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    /**
     * 是否保持激活
     */
    public Integer getKeepalive() {
        return keepalive;
    }

    /**
     * 是否保持激活
     */
    public void setKeepalive(Integer keepalive) {
        this.keepalive = keepalive;
    }

    /**
     * 是否要求权限
     */
    public Integer getRequireauth() {
        return requireauth;
    }

    /**
     * 是否要求权限
     */
    public void setRequireauth(Integer requireauth) {
        this.requireauth = requireauth;
    }

    /**
     * 父id
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 父id
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 是否启用
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 是否启用
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Menu other = (Menu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIconcls() == null ? other.getIconcls() == null : this.getIconcls().equals(other.getIconcls()))
            && (this.getKeepalive() == null ? other.getKeepalive() == null : this.getKeepalive().equals(other.getKeepalive()))
            && (this.getRequireauth() == null ? other.getRequireauth() == null : this.getRequireauth().equals(other.getRequireauth()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIconcls() == null) ? 0 : getIconcls().hashCode());
        result = prime * result + ((getKeepalive() == null) ? 0 : getKeepalive().hashCode());
        result = prime * result + ((getRequireauth() == null) ? 0 : getRequireauth().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", path=").append(path);
        sb.append(", component=").append(component);
        sb.append(", name=").append(name);
        sb.append(", iconcls=").append(iconcls);
        sb.append(", keepalive=").append(keepalive);
        sb.append(", requireauth=").append(requireauth);
        sb.append(", parentid=").append(parentid);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}