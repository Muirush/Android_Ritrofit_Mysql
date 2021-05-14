package com.magic.myapplication.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class userModel {
    @Expose
    @SerializedName("fullname")
    private  String  fullname;
    @Expose
    @SerializedName("phone")
    private  String  phone;
    @Expose
    @SerializedName("password")
    private  String  password;
    @Expose
    @SerializedName("success")
    private  boolean success;
    @Expose
    @SerializedName("message")
    private  String  message;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
