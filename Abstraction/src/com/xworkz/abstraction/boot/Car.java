package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Vehicle;

public class Car extends Vehicle {


    @Override
    public void start() {
        System.out.println("Car starts with key/engine button.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops.");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

    @Override
    public void horn() {
        System.out.println("Car horn: Beep! Beep!");
    }
}

