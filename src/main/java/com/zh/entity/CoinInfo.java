package com.zh.entity;

import java.io.Serializable;
import java.util.Date;

public class CoinInfo implements Serializable {
    private static final long serialVersionUID = 4482322742335008507L;

    private Integer id;

    private Integer coinId;

    private String editImgUrl;

    private String plate;

    private String editName;

    private String editInfo;

    private String teamInfo;

    private String github;

    private String reddit;

    private String twitter;

    private String facebook;

    private String website;

    private String whitePaper;

    private String explorer;

    private Date createTime;

    private Date updateTime;

    private String info;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCoinId() {
        return coinId;
    }

    public void setCoinId(Integer coinId) {
        this.coinId = coinId;
    }

    public String getEditImgUrl() {
        return editImgUrl;
    }

    public void setEditImgUrl(String editImgUrl) {
        this.editImgUrl = editImgUrl == null ? null : editImgUrl.trim();
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate == null ? null : plate.trim();
    }

    public String getEditName() {
        return editName;
    }

    public void setEditName(String editName) {
        this.editName = editName == null ? null : editName.trim();
    }

    public String getEditInfo() {
        return editInfo;
    }

    public void setEditInfo(String editInfo) {
        this.editInfo = editInfo == null ? null : editInfo.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", coinId=").append(coinId);
        sb.append(", editImgUrl=").append(editImgUrl);
        sb.append(", plate=").append(plate);
        sb.append(", editName=").append(editName);
        sb.append(", editInfo=").append(editInfo);
        sb.append(", teamInfo=").append(teamInfo);
        sb.append(", github=").append(github);
        sb.append(", reddit=").append(reddit);
        sb.append(", twitter=").append(twitter);
        sb.append(", facebook=").append(facebook);
        sb.append(", website=").append(website);
        sb.append(", whitePaper=").append(whitePaper);
        sb.append(", explorer=").append(explorer);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", info=").append(info);
        sb.append("]");
        return sb.toString();
    }
}