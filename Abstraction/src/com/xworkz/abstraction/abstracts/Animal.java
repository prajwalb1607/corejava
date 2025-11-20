package com.xworkz.abstraction.abstracts;


    public abstract class Animal {
        public void start(){
            System.out.println("animal start eating");
        }
        public static void end(){
            System.out.println("animal ending eating");
        }

        public abstract void eat();
        public abstract void sleep();
        public abstract void walk();
        public abstract void sound();
        public abstract void run();

        String name;

        public Animal(String name){
            this();
            this.name=name;
            System.out.println("name of the animal");

        }
        public Animal(){

        }
    }


