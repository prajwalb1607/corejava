package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Car;

class Mobile {

    String brand;
    String model;
    int storage;
    int camera;
    double price;

    Mobile() {
        System.out.println("no args constructor");
    }

    Mobile(String brand, String model, int storage, int camera, double price) {
        System.out.println("all args constructor");
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.camera = camera;
        this.price = price;
    }

    public String toString() {
        return "Mobile [Brand=" + brand + ", Model=" + model +
                ", Storage=" + storage + "GB, Camera=" + camera +
                "MP, Price=" + price + "]";
    }

    public boolean equals(Object obj) {
        System.out.println("running  double equals method");


        if (this == obj)
            return true;

        if(obj instanceof Mobile){
            Mobile other=(Mobile) obj;
            return this.brand.equals(other.brand)&&
                    this.model.equals(other.model)&&
                   this.storage==(other.storage)&&
                   this.camera==(other.camera)&&
                    this.price==(other.price);
        }
return false;
    }
}


