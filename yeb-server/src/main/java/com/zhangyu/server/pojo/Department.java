package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName t_department
 */
@TableName(value ="t_department")
public class Department implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 父id
     */
    private Integer parentid;

    /**
     * 路径
     */
    private String deppath;

    /**
     * 是否启用
     */
    private Integer enabled;

    /**
     * 是否上级
     */
    private Integer isparent;

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
     * 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 部门名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 路径
     */
    public String getDeppath() {
        return deppath;
    }

    /**
     * 路径
     */
    public void setDeppath(String deppath) {
        this.deppath = deppath;
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

    /**
     * 是否上级
     */
    public Integer getIsparent() {
        return isparent;
    }

    /**
     * 是否上级
     */
    public void setIsparent(Integer isparent) {
        this.isparent = isparent;
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
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getDeppath() == null ? other.getDeppath() == null : this.getDeppath().equals(other.getDeppath()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()))
            && (this.getIsparent() == null ? other.getIsparent() == null : this.getIsparent().equals(other.getIsparent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getDeppath() == null) ? 0 : getDeppath().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        result = prime * result + ((getIsparent() == null) ? 0 : getIsparent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentid=").append(parentid);
        sb.append(", deppath=").append(deppath);
        sb.append(", enabled=").append(enabled);
        sb.append(", isparent=").append(isparent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}