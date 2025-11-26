package com.xworkz.interfaces.interfacess;

import com.xworkz.interfaces.imp.Car;

public interface Vehicle {
   public static final String BRAND = "TATA";
  public   static final String TYPE = "SUV";
   public static final int MAX_SPEED = 180;
  public   static final int WHEELS = 4;
  public   static final String FUEL = "Diesel";

   public abstract void start();
    public abstract  void stop();
   public abstract void accelerate();
   public abstract void brake();
   public abstract void horn();
}

