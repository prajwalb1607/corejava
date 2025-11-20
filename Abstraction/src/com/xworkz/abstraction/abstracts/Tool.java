package com.xworkz.abstraction.abstracts;

public abstract class Tool {

    public void info() {
        System.out.println("Hand tool or power tool");
    }

    public static void category() {
        System.out.println("Construction tool");
    }

    public abstract void start();
    public abstract void stop();
    public abstract void rotate();
    public abstract void drill();
    public abstract void maintain();

    int power;

    public Tool(int power) {
        this();
        this.power = power;
        System.out.println("Tool power: " + power);
    }

    public Tool() {
        System.out.println("Tool default constructor");
    }
}

