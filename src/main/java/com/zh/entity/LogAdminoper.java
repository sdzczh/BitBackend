package com.zh.entity;

import java.io.Serializable;
import java.util.Date;

public class LogAdminoper implements Serializable {
    private static final long serialVersionUID = -2433003759346549439L;

    private Integer id;

    private String account;

    private String oper;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper == null ? null : oper.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", account=").append(account);
        sb.append(", oper=").append(oper);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}