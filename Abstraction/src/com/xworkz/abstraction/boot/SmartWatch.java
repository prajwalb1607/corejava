package com.xworkz.abstraction.boot;



import com.xworkz.abstraction.abstracts.Gadget;

public class SmartWatch extends Gadget {

    public SmartWatch(int price) {
        super(price);
        System.out.println("SmartWatch object created");
    }

    @Override
    public void turnOn() { System.out.println("SmartWatch ON"); }

    @Override
    public void turnOff() { System.out.println("SmartWatch OFF"); }

    @Override
    public void trackSteps() { System.out.println("Tracking steps..."); }

    @Override
    public void showTime() { System.out.println("Showing time"); }

    @Override
    public void notifyAlerts() { System.out.println("Sending notifications"); }
}

