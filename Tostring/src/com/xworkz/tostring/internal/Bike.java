package com.xworkz.tostring.internal;

public class Bike {
    int price;
    String name;
    double quantity;
    String color;

    Bike(){
        System.out.println("no args constructor");
    }
    Bike(int price,String name,double quantity,String color){
        this.price=price;
        this.name=name;
        this.quantity=quantity;
        this.color=color;
    }
    public String toString(){
        return "Bike[price="+price+",name="+name+",quantity="+quantity+",color="+color+"]";

    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("running equals method");
        if (this==obj)
            return true;

        Bike other=(Bike )obj;
        return false;


    }

}


