package com.zh.entity;

import java.io.Serializable;

public class CapDistribution implements Serializable {
    private static final long serialVersionUID = -5419832799128971973L;

    private Integer id;

    private String coin;

    private Integer exchangeId;

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

    public Integer getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Integer exchangeId) {
        this.exchangeId = exchangeId;
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
        sb.append(", exchangeId=").append(exchangeId);
        sb.append(", param=").append(param);
        sb.append(", type=").append(type);
        sb.append(", amount=").append(amount);
        sb.append("]");
        return sb.toString();
    }
}