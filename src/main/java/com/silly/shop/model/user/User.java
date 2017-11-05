package com.silly.shop.model.user;

/**
 * Created by yunlong.zhang on 2017/11/5.
 */
public class User {

    String userId;
    String phoneNum;
    String email;
    String psw;
    String avastar;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getAvastar() {
        return avastar;
    }

    public void setAvastar(String avastar) {
        this.avastar = avastar;
    }

    @Override
    public String toString() {
        return "user{" +
                "phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", psw='" + psw + '\'' +
                ", avastar='" + avastar + '\'' +
                '}';
    }
}
