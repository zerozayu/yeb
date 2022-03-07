package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_employee_train
 */
@TableName(value ="t_employee_train")
public class EmployeeTrain implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 培训日期
     */
    private Date traindate;

    /**
     * 培训内容
     */
    private String traincontent;

    /**
     * 备注
     */
    private String remark;

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
     * 员工编号
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 员工编号
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 培训日期
     */
    public Date getTraindate() {
        return traindate;
    }

    /**
     * 培训日期
     */
    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    /**
     * 培训内容
     */
    public String getTraincontent() {
        return traincontent;
    }

    /**
     * 培训内容
     */
    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
        EmployeeTrain other = (EmployeeTrain) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getTraindate() == null ? other.getTraindate() == null : this.getTraindate().equals(other.getTraindate()))
            && (this.getTraincontent() == null ? other.getTraincontent() == null : this.getTraincontent().equals(other.getTraincontent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getTraindate() == null) ? 0 : getTraindate().hashCode());
        result = prime * result + ((getTraincontent() == null) ? 0 : getTraincontent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", eid=").append(eid);
        sb.append(", traindate=").append(traindate);
        sb.append(", traincontent=").append(traincontent);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}