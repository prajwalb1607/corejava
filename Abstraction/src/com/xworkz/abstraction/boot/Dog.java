package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Animal;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    @Override
    public void sound() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }

}



