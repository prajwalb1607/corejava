package com.xworkz.interfaces.interfacess;


    public interface RemoteControl {
        public static final String DEVICE = "Television";
        public static final String BRAND = "Sony";
        public static final int MAX_VOLUME = 100;
        public static final int MIN_VOLUME = 0;
        public static final String POWER_SOURCE = "Battery";

        public abstract void powerOn();
        public abstract void powerOff();
        public abstract void volumeUp();
        public abstract void volumeDown();
        public abstract void changeChannel();
    }

