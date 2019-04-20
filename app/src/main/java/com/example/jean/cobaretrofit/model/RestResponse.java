package com.example.jean.cobaretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestResponse {

    @SerializedName("success")
    private Boolean success;

    @SerializedName("data")
    private List<Club> data;

    public List<Club> getHistory() {
        return data;
    }

    public Boolean getMessages() {
        return success;
    }
}