package com.xworkz.tostring.external;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public Car() {
        System.out.println("no args constructor");
    }

    public Car(String brand, String model, int year, String color, double price) {
        System.out.println("all args constructor");
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }


    public String toString() {
        return "Car [Brand=" + brand + ", Model=" + model + ", Year=" + year +
                ", Color=" + color + ", Price=" + price + "]";
    }


    public boolean equals(Object obj) {
        System.out.println("running equals method");


        if (this == obj)
            return true;




        Car other = (Car) obj;
        return false;

                 }

}
