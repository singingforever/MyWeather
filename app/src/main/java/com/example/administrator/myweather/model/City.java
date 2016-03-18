package com.example.administrator.myweather.model;

/**
 * Created by Administrator on 2016/3/18.
 */
public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int ProvinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }

    public int getProvinceId() {
        return ProvinceId;
    }
}
