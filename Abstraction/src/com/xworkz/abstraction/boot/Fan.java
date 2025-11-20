package com.xworkz.abstraction.boot;


import com.xworkz.abstraction.abstracts.Applicance;

public class Fan extends Applicance {

        @Override
        public void turnOn() {
            System.out.println("Fan turns ON.");
        }

        @Override
        public void turnOff() {
            System.out.println("Fan turns OFF.");
        }

        @Override
        public void increaseSetting() {
            System.out.println("Increasing Fan speed.");
        }

        @Override
        public void decreaseSetting() {
            System.out.println("Decreasing Fan speed.");
        }

        @Override
        public void showStatus() {
            System.out.println("Fan status displayed.");
        }

        public Fan(String name){
            super(name);

        }

        }






