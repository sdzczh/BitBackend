package com.zh.entity;

import java.io.Serializable;

public class PlatformFunds implements Serializable {
    private static final long serialVersionUID = 5197154828654742503L;

    private Integer id;

    private Integer exchangeId;

    private String in;

    private String out;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
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
        sb.append(", exchangeId=").append(exchangeId);
        sb.append(", in=").append(in);
        sb.append(", out=").append(out);
        sb.append("]");
        return sb.toString();
    }
}