package com.zh.entity;

public class Coin {
    private CoinInfo coinInfo;
    private CoinManager coinManager;

    public CoinInfo getCoinInfo() {
        return coinInfo;
    }

    public void setCoinInfo(CoinInfo coinInfo) {
        this.coinInfo = coinInfo;
    }

    public CoinManager getCoinManager() {
        return coinManager;
    }

    public void setCoinManager(CoinManager coinManager) {
        this.coinManager = coinManager;
    }
}
