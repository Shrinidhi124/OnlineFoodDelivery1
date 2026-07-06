package com.OnlineFoodDelivery.dao;

import com.OnlineFoodDelivery.model.Menu;

public interface MenuDAO {

    void addMenu(Menu menu);

    Menu getMenuById(int menuId);

    void updateMenu(Menu menu);

    void deleteMenu(int menuId);

}