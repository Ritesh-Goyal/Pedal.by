package by.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import by.data.entity.commonfilter.CarManufacture;
import by.data.entity.commonfilter.CarModel;
import by.data.entity.commonfilter.Category;
import by.data.entity.commonfilter.Description;
import by.data.entity.commonfilter.Location;
import by.data.entity.commonfilter.ParentCategory;
import by.data.entity.commonfilter.Price;

/**
 * Created by Home911 on 28.09.2017.
 */

public class ProfileDomain {

    private String id;
    private String image;
    private String slug;
    private Location location;
    private Boolean auction;
    private String createdAt;
    private Description description;
    private Price price;
    private Integer carCompCount;
    private ParentCategory parentCategory;
    private Category category;
    private CarManufacture carManufacture;
    private CarModel carModel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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
