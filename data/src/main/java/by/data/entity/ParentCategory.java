package by.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Home911 on 26.09.2017.
 */

public class ParentCategory {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("required_car")
    @Expose
    private Boolean requiredCar;
    @SerializedName("image")
    @Expose
    private Object image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRequiredCar() {
        return requiredCar;
    }

    public void setRequiredCar(Boolean requiredCar) {
        this.requiredCar = requiredCar;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }
}
