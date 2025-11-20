package com.xworkz.abstraction.abstracts;



public abstract class Machine {

    public void details() {
        System.out.println("This is a machine");
    }

    public static void usage() {
        System.out.println("Machine used for automation");
    }

    public abstract void start();
    public abstract void stop();
    public abstract void process();
    public abstract void alert();
    public abstract void shutdown();

    int id;

    public Machine(int id) {
        this();
        this.id = id;
        System.out.println("Machine ID: " + id);
    }

    public Machine() {
        System.out.println("Machine default constructor");
    }
}

