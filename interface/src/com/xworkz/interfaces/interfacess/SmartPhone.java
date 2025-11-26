package com.xworkz.interfaces.interfacess;

public interface SmartPhone {

        public static final String BRAND = "Samsung";
        public static final String OS = "Android";
        public static final int RAM = 8;
        public static final int STORAGE = 128;
        public static final boolean SUPPORT_5G = true;

        public abstract void call();
        public abstract void message();
        public abstract void camera();
        public abstract void internet();
        public abstract void bluetooth();
    }

