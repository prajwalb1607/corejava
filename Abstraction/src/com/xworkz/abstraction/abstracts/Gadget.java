package com.xworkz.abstraction.abstracts;


public abstract class Gadget {

    public void info() {
        System.out.println("This is a wearable gadget");
    }

    public static void brand() {
        System.out.println("Gadget brand: Generic");
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void trackSteps();
    public abstract void showTime();
    public abstract void notifyAlerts();

    int price;

    public Gadget(int price) {
        this();
        this.price = price;
        System.out.println("Gadget price: " + price);
    }

    public Gadget() {
        System.out.println("Gadget default constructor");
    }
}

