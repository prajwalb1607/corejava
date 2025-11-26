package com.xworkz.interfaces.imp;

import com.xworkz.interfaces.interfacess.Resturant;

public class Hotel implements Resturant {


        public void takeOrder() { System.out.println("Order taken."); }
        public void serveFood() { System.out.println("Food served."); }
        public void prepareBill() { System.out.println("Bill prepared."); }
        public void cleanTable() { System.out.println("Table cleaned."); }
        public void welcomeCustomer() { System.out.println("Welcome to Food Paradise!"); }
    }
