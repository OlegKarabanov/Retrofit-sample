package ru.synergy.authenticated.pojo;

import com.google.gson.annotations.SerializedName;

public class AuthMessage {

    @SerializedName("message")
    private String message;

    @SerializedName("token")
    private String token;

    public AuthMessage(String message, String token) {
        this.message = message;
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
