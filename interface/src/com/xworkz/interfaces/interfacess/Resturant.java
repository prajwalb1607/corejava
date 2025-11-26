package com.xworkz.interfaces.interfacess;

public interface Resturant {
    static final String NAME = "Food Paradise";
    static final String LOCATION = "Bangalore";
    static final String TYPE = "Veg & Non-Veg";
    static final int TABLES = 50;
    static final double RATING = 4.6;

    void takeOrder();
    void serveFood();
    void prepareBill();
    void cleanTable();
    void welcomeCustomer();
}

