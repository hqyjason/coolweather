package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * author:hequnyu
 * Description:
 * Date:2020/7/29
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int proviceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
