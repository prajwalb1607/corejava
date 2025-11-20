package com.xworkz.abstraction.abstracts;


import com.xworkz.abstraction.boot.Fan;

public abstract class Applicance {

    public void name(){
        System.out.println("name of the applicance ");
    }
    public static void price (){
        System.out.println("price of the applicance");
    }
        public abstract void turnOn();
        public abstract void turnOff();
        public abstract void increaseSetting();
        public abstract void decreaseSetting();
        public abstract void showStatus();

        String name;


        public Applicance(String name){
            this( );
            this.name=name;
            System.out.println("name of the applicance is ="+name);

        }
        public Applicance(){

        }

    }




