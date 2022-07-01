package ru.synergy.authenticated.pojo;

import com.google.gson.annotations.SerializedName;

public class SimpleResponse {

    @SerializedName("message")
    private String message;

    public SimpleResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
