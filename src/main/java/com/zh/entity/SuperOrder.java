package com.zh.entity;

import java.io.Serializable;

public class SuperOrder implements Serializable {
    private static final long serialVersionUID = -6760124966763216413L;

    private Integer id;

    private String coin;

    private Integer exchangeId;

    private String price;

    private String size;

    private String side;

    private String total;

    private String time;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side == null ? null : side.trim();
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
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
        sb.append(", price=").append(price);
        sb.append(", size=").append(size);
        sb.append(", side=").append(side);
        sb.append(", total=").append(total);
        sb.append(", time=").append(time);
        sb.append("]");
        return sb.toString();
    }
}