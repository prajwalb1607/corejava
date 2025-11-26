package com.xworkz.interfaces.imp;

import com.xworkz.interfaces.interfacess.Vehicle;

public class Car implements Vehicle {

    public  void start() {
        System.out.println("Car starts");
    }
    public void stop() {
        System.out.println("Car stops");
    }
    public void accelerate() {
        System.out.println("Car accelerates");
    }
    public void brake() {
        System.out.println("Car brakes");
    }
    public void horn() {
        System.out.println("Car horn: Beep!");
    }
}



