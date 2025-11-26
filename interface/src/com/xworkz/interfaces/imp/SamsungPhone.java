package com.xworkz.interfaces.imp;


import com.xworkz.interfaces.interfacess.SmartPhone;

public class SamsungPhone implements SmartPhone {

        public void call(){ System.out.println("Calling..."); }
        public void message(){ System.out.println("Messaging..."); }
        public void camera(){ System.out.println("Camera Activated"); }
        public void internet(){ System.out.println("Internet Browsing"); }
        public void bluetooth(){ System.out.println("Bluetooth Connected"); }
    }

