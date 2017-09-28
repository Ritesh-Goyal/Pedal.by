package by.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Home911 on 28.09.2017.
 */

public class CountryDomain {

    @SerializedName("name")
    private String name;

    @SerializedName("code")
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}