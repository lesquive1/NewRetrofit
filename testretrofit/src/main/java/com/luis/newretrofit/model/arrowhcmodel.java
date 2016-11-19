package com.luis.newretrofit.model;

/**
 * Created by Luis on 11/18/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class arrowhcmodel {

    @SerializedName("item_name")
    @Expose
    private String itemName;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("price")
    @Expose
    private Float price;
    @SerializedName("id")
    @Expose
    private String id;

    /**
     *
     * @return
     * The itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     *
     * @param itemName
     * The item_name
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The category
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The price
     */
    public Float getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

}