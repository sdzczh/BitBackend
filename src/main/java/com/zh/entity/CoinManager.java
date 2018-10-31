package com.zh.entity;

import java.io.Serializable;
import java.util.Date;

public class CoinManager implements Serializable {
    private static final long serialVersionUID = 6498308171319941400L;

    private Integer id;

    private String name;

    private String symbol;

    private String websiteSlug;

    private String logoUrl;

    private String urlTransaction;

    private String urlAddressinfo;

    private String circulatingSupply;

    private String marketCap;

    private String volume24h;

    private String maxSupply;

    private String markeyRatio;

    private String turnoverRate;

    private String circulationRate;

    private String teamInfo;

    private String github;

    private String reddit;

    private String twitter;

    private String facebook;

    private String website;

    private String whitePaper;

    private String explorer;

    private Date createtime;

    private Date updatetime;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }

    public String getWebsiteSlug() {
        return websiteSlug;
    }

    public void setWebsiteSlug(String websiteSlug) {
        this.websiteSlug = websiteSlug == null ? null : websiteSlug.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getUrlTransaction() {
        return urlTransaction;
    }

    public void setUrlTransaction(String urlTransaction) {
        this.urlTransaction = urlTransaction == null ? null : urlTransaction.trim();
    }

    public String getUrlAddressinfo() {
        return urlAddressinfo;
    }

    public void setUrlAddressinfo(String urlAddressinfo) {
        this.urlAddressinfo = urlAddressinfo == null ? null : urlAddressinfo.trim();
    }

    public String getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(String circulatingSupply) {
        this.circulatingSupply = circulatingSupply == null ? null : circulatingSupply.trim();
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap == null ? null : marketCap.trim();
    }

    public String getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(String volume24h) {
        this.volume24h = volume24h == null ? null : volume24h.trim();
    }

    public String getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply == null ? null : maxSupply.trim();
    }

    public String getMarkeyRatio() {
        return markeyRatio;
    }

    public void setMarkeyRatio(String markeyRatio) {
        this.markeyRatio = markeyRatio == null ? null : markeyRatio.trim();
    }

    public String getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(String turnoverRate) {
        this.turnoverRate = turnoverRate == null ? null : turnoverRate.trim();
    }

    public String getCirculationRate() {
        return circulationRate;
    }

    public void setCirculationRate(String circulationRate) {
        this.circulationRate = circulationRate == null ? null : circulationRate.trim();
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo == null ? null : teamInfo.trim();
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github == null ? null : github.trim();
    }

    public String getReddit() {
        return reddit;
    }

    public void setReddit(String reddit) {
        this.reddit = reddit == null ? null : reddit.trim();
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter == null ? null : twitter.trim();
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook == null ? null : facebook.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getWhitePaper() {
        return whitePaper;
    }

    public void setWhitePaper(String whitePaper) {
        this.whitePaper = whitePaper == null ? null : whitePaper.trim();
    }

    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer == null ? null : explorer.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", symbol=").append(symbol);
        sb.append(", websiteSlug=").append(websiteSlug);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", urlTransaction=").append(urlTransaction);
        sb.append(", urlAddressinfo=").append(urlAddressinfo);
        sb.append(", circulatingSupply=").append(circulatingSupply);
        sb.append(", marketCap=").append(marketCap);
        sb.append(", volume24h=").append(volume24h);
        sb.append(", maxSupply=").append(maxSupply);
        sb.append(", markeyRatio=").append(markeyRatio);
        sb.append(", turnoverRate=").append(turnoverRate);
        sb.append(", circulationRate=").append(circulationRate);
        sb.append(", teamInfo=").append(teamInfo);
        sb.append(", github=").append(github);
        sb.append(", reddit=").append(reddit);
        sb.append(", twitter=").append(twitter);
        sb.append(", facebook=").append(facebook);
        sb.append(", website=").append(website);
        sb.append(", whitePaper=").append(whitePaper);
        sb.append(", explorer=").append(explorer);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", info=").append(info);
        sb.append("]");
        return sb.toString();
    }
}