package com.zh.entity;

import java.io.Serializable;
import java.util.Date;

public class LogUserlogin implements Serializable {
    private static final long serialVersionUID = 7212214620966688657L;

    private Integer id;

    private String phone;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
        sb.append(", phone=").append(phone);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}