package com.xworkz.abstraction.abstracts;

public abstract class Transport {

    public void info() {
        System.out.println("Transport vehicle");
    }

    public static void type() {
        System.out.println("Public transport");
    }

    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public abstract void brake();
    public abstract void signal();

    int number;

    public Transport(int number) {
        this();
        this.number = number;
        System.out.println("Transport number: " + number);
    }

    public Transport() {
        System.out.println("Transport default constructor");
    }
}

