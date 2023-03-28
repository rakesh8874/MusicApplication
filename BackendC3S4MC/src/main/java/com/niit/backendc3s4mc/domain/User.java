package com.niit.backendc3s4mc.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
    @Id
    private String userId;
    private String userPassword;
    private String userName;
    private int userPhone;
    private UserTrackService userTrackService;

    public User() {
    }

    public User(String userId, String userPassword, String userName, int userPhone, UserTrackService userTrackService) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userTrackService = userTrackService;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    public UserTrackService getUserTrackService() {
        return userTrackService;
    }

    public void setUserTrackService(UserTrackService userTrackService) {
        this.userTrackService = userTrackService;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone=" + userPhone +
                ", userTrackService=" + userTrackService +
                '}';
    }
}
