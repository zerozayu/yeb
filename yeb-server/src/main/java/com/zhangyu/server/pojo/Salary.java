package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_salary
 */
@TableName(value ="t_salary")
public class Salary implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 基本工资
     */
    private Integer basicsalary;

    /**
     * 奖金
     */
    private Integer bonus;

    /**
     * 午餐补助
     */
    private Integer lunchsalary;

    /**
     * 交通补助
     */
    private Integer trafficsalary;

    /**
     * 应发工资
     */
    private Integer allsalary;

    /**
     * 养老金基数
     */
    private Integer pensionbase;

    /**
     * 养老金比率
     */
    private Double pensionper;

    /**
     * 启用时间
     */
    private Date createdate;

    /**
     * 医疗基数
     */
    private Integer medicalbase;

    /**
     * 医疗保险比率
     */
    private Double medicalper;

    /**
     * 公积金基数
     */
    private Integer accumulationfundbase;

    /**
     * 公积金比率
     */
    private Double accumulationfundper;

    /**
     * 名称
     */
    private String name;

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
     * 基本工资
     */
    public Integer getBasicsalary() {
        return basicsalary;
    }

    /**
     * 基本工资
     */
    public void setBasicsalary(Integer basicsalary) {
        this.basicsalary = basicsalary;
    }

    /**
     * 奖金
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 奖金
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 午餐补助
     */
    public Integer getLunchsalary() {
        return lunchsalary;
    }

    /**
     * 午餐补助
     */
    public void setLunchsalary(Integer lunchsalary) {
        this.lunchsalary = lunchsalary;
    }

    /**
     * 交通补助
     */
    public Integer getTrafficsalary() {
        return trafficsalary;
    }

    /**
     * 交通补助
     */
    public void setTrafficsalary(Integer trafficsalary) {
        this.trafficsalary = trafficsalary;
    }

    /**
     * 应发工资
     */
    public Integer getAllsalary() {
        return allsalary;
    }

    /**
     * 应发工资
     */
    public void setAllsalary(Integer allsalary) {
        this.allsalary = allsalary;
    }

    /**
     * 养老金基数
     */
    public Integer getPensionbase() {
        return pensionbase;
    }

    /**
     * 养老金基数
     */
    public void setPensionbase(Integer pensionbase) {
        this.pensionbase = pensionbase;
    }

    /**
     * 养老金比率
     */
    public Double getPensionper() {
        return pensionper;
    }

    /**
     * 养老金比率
     */
    public void setPensionper(Double pensionper) {
        this.pensionper = pensionper;
    }

    /**
     * 启用时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 启用时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 医疗基数
     */
    public Integer getMedicalbase() {
        return medicalbase;
    }

    /**
     * 医疗基数
     */
    public void setMedicalbase(Integer medicalbase) {
        this.medicalbase = medicalbase;
    }

    /**
     * 医疗保险比率
     */
    public Double getMedicalper() {
        return medicalper;
    }

    /**
     * 医疗保险比率
     */
    public void setMedicalper(Double medicalper) {
        this.medicalper = medicalper;
    }

    /**
     * 公积金基数
     */
    public Integer getAccumulationfundbase() {
        return accumulationfundbase;
    }

    /**
     * 公积金基数
     */
    public void setAccumulationfundbase(Integer accumulationfundbase) {
        this.accumulationfundbase = accumulationfundbase;
    }

    /**
     * 公积金比率
     */
    public Double getAccumulationfundper() {
        return accumulationfundper;
    }

    /**
     * 公积金比率
     */
    public void setAccumulationfundper(Double accumulationfundper) {
        this.accumulationfundper = accumulationfundper;
    }

    /**
     * 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     */
    public void setName(String name) {
        this.name = name;
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
        Salary other = (Salary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBasicsalary() == null ? other.getBasicsalary() == null : this.getBasicsalary().equals(other.getBasicsalary()))
            && (this.getBonus() == null ? other.getBonus() == null : this.getBonus().equals(other.getBonus()))
            && (this.getLunchsalary() == null ? other.getLunchsalary() == null : this.getLunchsalary().equals(other.getLunchsalary()))
            && (this.getTrafficsalary() == null ? other.getTrafficsalary() == null : this.getTrafficsalary().equals(other.getTrafficsalary()))
            && (this.getAllsalary() == null ? other.getAllsalary() == null : this.getAllsalary().equals(other.getAllsalary()))
            && (this.getPensionbase() == null ? other.getPensionbase() == null : this.getPensionbase().equals(other.getPensionbase()))
            && (this.getPensionper() == null ? other.getPensionper() == null : this.getPensionper().equals(other.getPensionper()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getMedicalbase() == null ? other.getMedicalbase() == null : this.getMedicalbase().equals(other.getMedicalbase()))
            && (this.getMedicalper() == null ? other.getMedicalper() == null : this.getMedicalper().equals(other.getMedicalper()))
            && (this.getAccumulationfundbase() == null ? other.getAccumulationfundbase() == null : this.getAccumulationfundbase().equals(other.getAccumulationfundbase()))
            && (this.getAccumulationfundper() == null ? other.getAccumulationfundper() == null : this.getAccumulationfundper().equals(other.getAccumulationfundper()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBasicsalary() == null) ? 0 : getBasicsalary().hashCode());
        result = prime * result + ((getBonus() == null) ? 0 : getBonus().hashCode());
        result = prime * result + ((getLunchsalary() == null) ? 0 : getLunchsalary().hashCode());
        result = prime * result + ((getTrafficsalary() == null) ? 0 : getTrafficsalary().hashCode());
        result = prime * result + ((getAllsalary() == null) ? 0 : getAllsalary().hashCode());
        result = prime * result + ((getPensionbase() == null) ? 0 : getPensionbase().hashCode());
        result = prime * result + ((getPensionper() == null) ? 0 : getPensionper().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getMedicalbase() == null) ? 0 : getMedicalbase().hashCode());
        result = prime * result + ((getMedicalper() == null) ? 0 : getMedicalper().hashCode());
        result = prime * result + ((getAccumulationfundbase() == null) ? 0 : getAccumulationfundbase().hashCode());
        result = prime * result + ((getAccumulationfundper() == null) ? 0 : getAccumulationfundper().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", basicsalary=").append(basicsalary);
        sb.append(", bonus=").append(bonus);
        sb.append(", lunchsalary=").append(lunchsalary);
        sb.append(", trafficsalary=").append(trafficsalary);
        sb.append(", allsalary=").append(allsalary);
        sb.append(", pensionbase=").append(pensionbase);
        sb.append(", pensionper=").append(pensionper);
        sb.append(", createdate=").append(createdate);
        sb.append(", medicalbase=").append(medicalbase);
        sb.append(", medicalper=").append(medicalper);
        sb.append(", accumulationfundbase=").append(accumulationfundbase);
        sb.append(", accumulationfundper=").append(accumulationfundper);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}