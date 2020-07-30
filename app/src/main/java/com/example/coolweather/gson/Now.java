package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * author:hequnyu
 * Description:
 * Date:2020/7/30
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}
