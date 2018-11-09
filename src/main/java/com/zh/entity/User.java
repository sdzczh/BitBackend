package com.zh.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private static final long serialVersionUID = 7729478388653371320L;

    private Integer id;

    private String phone;

    private String userpassword;

    private String username;

    private Integer referenceid;

    private String idcard;

    private Byte idstatus;

    private String headpath;

    private String secretkey;

    private String token;

    private Date tokencreatetime;

    private String orderpwd;

    private Date logintime;

    private String deviceInfo;

    private Integer deviceType;

    private String deviceOs;

    private Byte state;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getReferenceid() {
        return referenceid;
    }

    public void setReferenceid(Integer referenceid) {
        this.referenceid = referenceid;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Byte getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Byte idstatus) {
        this.idstatus = idstatus;
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath == null ? null : headpath.trim();
    }

    public String getSecretkey() {
        return secretkey;
    }

    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey == null ? null : secretkey.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getTokencreatetime() {
        return tokencreatetime;
    }

    public void setTokencreatetime(Date tokencreatetime) {
        this.tokencreatetime = tokencreatetime;
    }

    public String getOrderpwd() {
        return orderpwd;
    }

    public void setOrderpwd(String orderpwd) {
        this.orderpwd = orderpwd == null ? null : orderpwd.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo == null ? null : deviceInfo.trim();
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceOs() {
        return deviceOs;
    }

    public void setDeviceOs(String deviceOs) {
        this.deviceOs = deviceOs == null ? null : deviceOs.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", phone=").append(phone);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", username=").append(username);
        sb.append(", referenceid=").append(referenceid);
        sb.append(", idcard=").append(idcard);
        sb.append(", idstatus=").append(idstatus);
        sb.append(", headpath=").append(headpath);
        sb.append(", secretkey=").append(secretkey);
        sb.append(", token=").append(token);
        sb.append(", tokencreatetime=").append(tokencreatetime);
        sb.append(", orderpwd=").append(orderpwd);
        sb.append(", logintime=").append(logintime);
        sb.append(", deviceInfo=").append(deviceInfo);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceOs=").append(deviceOs);
        sb.append(", state=").append(state);
        sb.append(", createtime=").append(createtime);
        sb.append(", updatetime=").append(updatetime);
        sb.append("]");
        return sb.toString();
    }
}