package com.xworkz.abstraction.abstracts;

public abstract class Building {
    public abstract void openGate();
    public abstract void closeGate();
    public abstract void clean();
    public abstract void paint();
    public abstract void maintain();

    int price;
    String name;


    public Building(int price){
        this();
        this.price=price;
        System.out.println("price of the house is ="+price);

    }
    public Building(){

    }
}

