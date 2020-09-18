package com.example.countries;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Country {
    @SerializedName("name")
    private String name;
    @SerializedName("flag")
    private String flag;
    @SerializedName("capital")
    private String capital;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Country(String name, String flag, String capital) {
        this.name = name;
        this.flag = flag;
        this.capital = capital;
    }
}
