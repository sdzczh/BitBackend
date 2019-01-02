package com.zh.entity;

import java.io.Serializable;

public class CapDistribution implements Serializable {
    private static final long serialVersionUID = 2770987455926028260L;

    private Integer id;

    private String coin;

    private Integer exchangeid;

    private String param;

    private Integer type;

    private String amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public Integer getExchangeid() {
        return exchangeid;
    }

    public void setExchangeid(Integer exchangeid) {
        this.exchangeid = exchangeid;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", coin=").append(coin);
        sb.append(", exchangeid=").append(exchangeid);
        sb.append(", param=").append(param);
        sb.append(", type=").append(type);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}