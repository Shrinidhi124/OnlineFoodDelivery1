package com.OnlineFoodDelivery.dao;

import com.OnlineFoodDelivery.model.Restaurant;

public interface RestaurantDAO {

    void addRestaurant(Restaurant restaurant);

    Restaurant getRestaurantById(int restaurantId);

    void updateRestaurant(Restaurant restaurant);

    void deleteRestaurant(int restaurantId);

}