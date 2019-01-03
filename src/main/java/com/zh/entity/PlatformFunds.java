package com.zh.entity;

import java.io.Serializable;

public class PlatformFunds implements Serializable {
    private static final long serialVersionUID = -4013211595789575664L;

    private Integer id;

    private Integer exchangeid;

    private String in;

    private String out;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExchangeid() {
        return exchangeid;
    }

    public void setExchangeid(Integer exchangeid) {
        this.exchangeid = exchangeid;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in == null ? null : in.trim();
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out == null ? null : out.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", exchangeid=").append(exchangeid);
        sb.append(", in=").append(in);
        sb.append(", out=").append(out);
        sb.append("]");
        return sb.toString();
    }
}