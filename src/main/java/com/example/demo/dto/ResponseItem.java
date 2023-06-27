package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


public class ResponseItem {
    public String getBaseDate() {
        return baseDate;
    }

    public void setBaseDate(String baseDate) {
        this.baseDate = baseDate;
    }

    public String getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(String baseTime) {
        this.baseTime = baseTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFcstDate() {
        return fcstDate;
    }

    public void setFcstDate(String fcstDate) {
        this.fcstDate = fcstDate;
    }

    public String getFcstValue() {
        return fcstValue;
    }

    public void setFcstValue(String fcstValue) {
        this.fcstValue = fcstValue;
    }

    public String getFcstTime() {
        return fcstTime;
    }

    public void setFcstTime(String fcstTime) {
        this.fcstTime = fcstTime;
    }

    public int getNx() {
        return nx;
    }

    public void setNx(int nx) {
        this.nx = nx;
    }

    public int getNy() {
        return ny;
    }

    public void setNy(int ny) {
        this.ny = ny;
    }
    @JsonProperty("baseDate")
    private String baseDate;

    @JsonProperty("baseTime")
    private String baseTime;

    @JsonProperty("category")
    private String category;
    @JsonProperty("fcstDate")
    private String fcstDate;

    @JsonProperty("fcstValue")
    private String fcstValue;

    @JsonProperty("fcstTime")
    private String fcstTime;

    @JsonProperty("nx")
    private int nx;
    @JsonProperty("ny")
    private int ny;
}
