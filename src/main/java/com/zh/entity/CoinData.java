package com.zh.entity;

import java.io.Serializable;

public class CoinData implements Serializable {
    private static final long serialVersionUID = 13614455866317544L;

    private Integer id;

    private String coin;

    private Integer exchangeid;

    private String price;

    private String priceUsdt;

    private String priceChange;

    private String priceChangePercent;

    private String dayHigh;

    private String dayLow;

    private String dayVolume;

    private String marketCap;

    private String circulation;

    private String rank;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getPriceUsdt() {
        return priceUsdt;
    }

    public void setPriceUsdt(String priceUsdt) {
        this.priceUsdt = priceUsdt == null ? null : priceUsdt.trim();
    }

    public String getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange == null ? null : priceChange.trim();
    }

    public String getPriceChangePercent() {
        return priceChangePercent;
    }

    public void setPriceChangePercent(String priceChangePercent) {
        this.priceChangePercent = priceChangePercent == null ? null : priceChangePercent.trim();
    }

    public String getDayHigh() {
        return dayHigh;
    }

    public void setDayHigh(String dayHigh) {
        this.dayHigh = dayHigh == null ? null : dayHigh.trim();
    }

    public String getDayLow() {
        return dayLow;
    }

    public void setDayLow(String dayLow) {
        this.dayLow = dayLow == null ? null : dayLow.trim();
    }

    public String getDayVolume() {
        return dayVolume;
    }

    public void setDayVolume(String dayVolume) {
        this.dayVolume = dayVolume == null ? null : dayVolume.trim();
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap == null ? null : marketCap.trim();
    }

    public String getCirculation() {
        return circulation;
    }

    public void setCirculation(String circulation) {
        this.circulation = circulation == null ? null : circulation.trim();
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
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
        sb.append(", price=").append(price);
        sb.append(", priceUsdt=").append(priceUsdt);
        sb.append(", priceChange=").append(priceChange);
        sb.append(", priceChangePercent=").append(priceChangePercent);
        sb.append(", dayHigh=").append(dayHigh);
        sb.append(", dayLow=").append(dayLow);
        sb.append(", dayVolume=").append(dayVolume);
        sb.append(", marketCap=").append(marketCap);
        sb.append(", circulation=").append(circulation);
        sb.append(", rank=").append(rank);
        sb.append("]");
        return sb.toString();
    }
}