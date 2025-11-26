package com.xworkz.interfaces.imp;


import com.xworkz.interfaces.interfacess.RemoteControl;

public class TVRemote implements RemoteControl {

        public void powerOn(){ System.out.println("TV is ON"); }
        public void powerOff(){ System.out.println("TV is OFF"); }
        public void volumeUp(){ System.out.println("Volume Increased"); }
        public void volumeDown(){ System.out.println("Volume Decreased"); }
        public void changeChannel(){ System.out.println("Channel Changed"); }
    }

