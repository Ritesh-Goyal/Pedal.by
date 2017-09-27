package by.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Home911 on 26.09.2017.
 */

public class Description {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("is_news")
    @Expose
    private Boolean isNews;
    @SerializedName("manufacture")
    @Expose
    private Object manufacture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsNews() {
        return isNews;
    }

    public void setIsNews(Boolean isNews) {
        this.isNews = isNews;
    }

    public Object getManufacture() {
        return manufacture;
    }

    public void setManufacture(Object manufacture) {
        this.manufacture = manufacture;
    }
}
