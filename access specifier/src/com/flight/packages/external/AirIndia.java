package com.flight.packages.external;

import com.flight.packages.internal.Flight;

public class AirIndia extends Flight {
   protected void takeOff() {
        System.out.println("Air India flight taking off smoothly");
    }
   protected void land() {
        System.out.println("Air India flight landing on time");
    }
    public static void main(String[] args){
        AirIndia a=new AirIndia();
        a.openGate();
        a.closeGate();
        a.takeOff();
        a.land();
    }


}
