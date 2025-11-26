package com.xworkz.interfaces.interfacess;

public interface Robot {
    static final String NAME = "RoboX";
    static final String MATERIAL = "Metal";
    static final int BATTERY = 100;
    static final boolean AI = true;
    static final String VERSION = "v2.5";

    void move();
    void speak();
    void scan();
    void recharge();
    void lift();
}
