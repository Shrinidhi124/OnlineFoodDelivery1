package com.OnlineFoodDelivery.model;

public class Restaurant {

    private int restaurantId;
    private String restaurantName;
    private String address;
    private String phone;
    private String cuisineType;
    private double rating;
    private String imageUrl;

    // Default Constructor
    public Restaurant() {

    }

    // Parameterized Constructor
    public Restaurant(int restaurantId, String restaurantName, String address,
            String phone, String cuisineType, double rating, String imageUrl) {

        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.address = address;
        this.phone = phone;
        this.cuisineType = cuisineType;
        this.rating = rating;
        this.imageUrl = imageUrl;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}