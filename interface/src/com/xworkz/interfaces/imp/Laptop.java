package com.xworkz.interfaces.imp;


import com.xworkz.interfaces.interfacess.Computer;

public class Laptop implements Computer {

    public void boot() { System.out.println("Laptop booting..."); }
    public void shutdown() { System.out.println("Laptop shutting down..."); }
    public void runProgram() { System.out.println("Running program..."); }
    public void connectWifi() { System.out.println("Laptop connected to WiFi"); }
    public void displaySpecs() { System.out.println("Showing laptop specs"); }
}
