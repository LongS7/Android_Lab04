package com.example.android_lab04;

public class Product {
    private int photo;
    private String name;
    private float rating;
    private int numOfRating;
    private double price;
    private int discountPercent;

    public Product(int photo, String name, float rating, int numOfRating, double price, int discountPercent) {
        this.photo = photo;
        this.name = name;
        this.rating = rating;
        this.numOfRating = numOfRating;
        this.price = price;
        this.discountPercent = discountPercent;
    }

    public Product() {
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getNumOfRating() {
        return numOfRating;
    }

    public void setNumOfRating(int numOfRating) {
        this.numOfRating = numOfRating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return "Product{" +
                "photo=" + photo +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", numOfRating=" + numOfRating +
                ", price=" + price +
                ", discountPercent=" + discountPercent +
                '}';
    }
}
