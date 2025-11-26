package com.xworkz.interfaces.imp;

import com.xworkz.interfaces.interfacess.RemoteControl;

public class RemoteRunner {
        public static void main(String[] args){
            System.out.println("Device===="+ RemoteControl.DEVICE);
            System.out.println("Brand===="+RemoteControl.BRAND);
            System.out.println("Max Volume===="+RemoteControl.MAX_VOLUME);
            System.out.println("Min Volume===="+RemoteControl.MIN_VOLUME);
            System.out.println("Power Source===="+RemoteControl.POWER_SOURCE);

            RemoteControl remote = new TVRemote();
            remote.powerOn();
            remote.volumeUp();
            remote.changeChannel();
            remote.powerOff();
        }
    }
