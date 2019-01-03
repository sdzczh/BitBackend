package com.zh.entity;

import java.io.Serializable;

public class DayState implements Serializable {
    private static final long serialVersionUID = 3872752032867977086L;

    private Integer id;

    private Integer exchangeid;

    private String coin;

    private String dayIn;

    private String dayOut;

    private String actual;

    private String ratio;

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

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin == null ? null : coin.trim();
    }

    public String getDayIn() {
        return dayIn;
    }

    public void setDayIn(String dayIn) {
        this.dayIn = dayIn == null ? null : dayIn.trim();
    }

    public String getDayOut() {
        return dayOut;
    }

    public void setDayOut(String dayOut) {
        this.dayOut = dayOut == null ? null : dayOut.trim();
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual == null ? null : actual.trim();
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
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
        sb.append(", coin=").append(coin);
        sb.append(", dayIn=").append(dayIn);
        sb.append(", dayOut=").append(dayOut);
        sb.append(", actual=").append(actual);
        sb.append(", ratio=").append(ratio);
        sb.append("]");
        return sb.toString();
    }
}