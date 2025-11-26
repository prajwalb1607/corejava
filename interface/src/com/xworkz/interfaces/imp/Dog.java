package com.xworkz.interfaces.imp;

import com.xworkz.interfaces.interfacess.Animal;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");

    }

    @Override
    public void eating() {
        System.out.println("Dog eating");
    }
}
