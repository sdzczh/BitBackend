package com.zh.entity;

import java.io.Serializable;
import java.util.Date;

public class LogAdminlogin implements Serializable {
    private static final long serialVersionUID = 2732246147517219814L;

    private Integer id;

    private String account;

    private String clientip;

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

    public String getClientip() {
        return clientip;
    }

    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
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
        sb.append(", clientip=").append(clientip);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}