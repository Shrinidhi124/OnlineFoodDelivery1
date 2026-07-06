package com.OnlineFoodDelivery.model;

public class User {

    // User ID
    private int userId;

    // User Name
    private String name;

    // User Email
    private String email;

    // User Password
    private String password;

    // User Phone
    private String phone;

    // User Address
    private String address;

    // Default Constructor
    public User() {

    }

    // Parameterized Constructor
    public User(int userId, String name, String email, String password, String phone, String address) {

        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;

    }

    // Getter and Setter for User ID
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter and Setter for Phone
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Getter and Setter for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}