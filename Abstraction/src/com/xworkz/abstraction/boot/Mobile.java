package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Device;

public class Mobile extends Device {

    public void price(){
        System.out.println("price of the mobile");
    }
    public static void storage(){
        System.out.println("storage of the mobile");
    }

    @Override
    public void powerOn() { System.out.println("Mobile Powered ON"); }

    @Override
    public void powerOff() { System.out.println("Mobile Powered OFF"); }

    @Override
    public void restart() { System.out.println("Mobile Restarting"); }

    @Override
    public void update() { System.out.println("Mobile Updating"); }

    @Override
    public void showInfo() { System.out.println("Mobile Info Displayed"); }


    public Mobile(int price){
        super(price);
    }


    }


