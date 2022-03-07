package com.zhangyu.server.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName t_mail_log
 */
@TableName(value ="t_mail_log")
public class MailLog implements Serializable {
    /**
     * 消息id
     */
    private String msgid;

    /**
     * 接收员工id
     */
    private Integer eid;

    /**
     * 状态（0:消息投递中 1:投递成功 2:投递失败）
     */
    private Integer status;

    /**
     * 路由键
     */
    private String routekey;

    /**
     * 交换机
     */
    private String exchange;

    /**
     * 重试次数
     */
    private Integer count;

    /**
     * 重试时间
     */
    private Date trytime;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 更新时间
     */
    private Date updatetime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 消息id
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * 消息id
     */
    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    /**
     * 接收员工id
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 接收员工id
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 状态（0:消息投递中 1:投递成功 2:投递失败）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态（0:消息投递中 1:投递成功 2:投递失败）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 路由键
     */
    public String getRoutekey() {
        return routekey;
    }

    /**
     * 路由键
     */
    public void setRoutekey(String routekey) {
        this.routekey = routekey;
    }

    /**
     * 交换机
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * 交换机
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * 重试次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 重试次数
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 重试时间
     */
    public Date getTrytime() {
        return trytime;
    }

    /**
     * 重试时间
     */
    public void setTrytime(Date trytime) {
        this.trytime = trytime;
    }

    /**
     * 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 更新时间
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * 更新时间
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
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
        MailLog other = (MailLog) that;
        return (this.getMsgid() == null ? other.getMsgid() == null : this.getMsgid().equals(other.getMsgid()))
            && (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRoutekey() == null ? other.getRoutekey() == null : this.getRoutekey().equals(other.getRoutekey()))
            && (this.getExchange() == null ? other.getExchange() == null : this.getExchange().equals(other.getExchange()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getTrytime() == null ? other.getTrytime() == null : this.getTrytime().equals(other.getTrytime()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMsgid() == null) ? 0 : getMsgid().hashCode());
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRoutekey() == null) ? 0 : getRoutekey().hashCode());
        result = prime * result + ((getExchange() == null) ? 0 : getExchange().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getTrytime() == null) ? 0 : getTrytime().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", msgid=").append(msgid);
        sb.append(", eid=").append(eid);
        sb.append(", status=").append(status);
        sb.append(", routekey=").append(routekey);
        sb.append(", exchange=").append(exchange);
        sb.append(", count=").append(count);
        sb.append(", trytime=").append(trytime);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}