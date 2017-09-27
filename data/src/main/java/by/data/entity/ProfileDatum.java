package by.data.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Home911 on 26.09.2017.
 */

public class ProfileDatum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("auction")
    @Expose
    private Boolean auction;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("car_comp_count")
    @Expose
    private Integer carCompCount;
    @SerializedName("parent_category")
    @Expose
    private ParentCategory parentCategory;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("car_manufacture")
    @Expose
    private CarManufacture carManufacture;
    @SerializedName("car_model")
    @Expose
    private CarModel carModel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Boolean getAuction() {
        return auction;
    }

    public void setAuction(Boolean auction) {
        this.auction = auction;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Integer getCarCompCount() {
        return carCompCount;
    }

    public void setCarCompCount(Integer carCompCount) {
        this.carCompCount = carCompCount;
    }

    public ParentCategory getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(ParentCategory parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public CarManufacture getCarManufacture() {
        return carManufacture;
    }

    public void setCarManufacture(CarManufacture carManufacture) {
        this.carManufacture = carManufacture;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }
}
