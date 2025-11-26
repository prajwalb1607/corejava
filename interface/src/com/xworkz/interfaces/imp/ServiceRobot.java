package com.xworkz.interfaces.imp;

import com.xworkz.interfaces.interfacess.Robot;

public class ServiceRobot implements Robot {

    public void move() { System.out.println("Robot moving."); }
    public void speak() { System.out.println("Robot speaking."); }
    public void scan() { System.out.println("Scanning object."); }
    public void recharge() { System.out.println("Recharging robot."); }
    public void lift() { System.out.println("Robot lifting item."); }
}

