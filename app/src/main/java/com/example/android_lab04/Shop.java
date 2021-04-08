package com.example.android_lab04;

public class Shop {
    private int shopImage;
    private String description;
    private String name;

    public Shop() {
    }

    public Shop(int shopImage, String description, String name) {
        this.shopImage = shopImage;
        this.description = description;
        this.name = name;
    }

    public int getShopImage() {
        return shopImage;
    }

    public void setShopImage(int shopImage) {
        this.shopImage = shopImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopImage=" + shopImage +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
