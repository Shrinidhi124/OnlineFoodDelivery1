package com.OnlineFoodDelivery.dao;

import com.OnlineFoodDelivery.model.User;

public interface UserDAO {

    void addUser(User user);

    User getUserById(int userId);

    void updateUser(User user);

    void deleteUser(int userId);

    User login(String email, String password);

}