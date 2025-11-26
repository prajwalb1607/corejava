package com.xworkz.interfaces.interfacess;

public interface Computer {


        static final String BRAND = "Dell";
        static final String PROCESSOR = "Intel i7";
        static final String RAM = "16GB";
        static final String STORAGE = "512GB SSD";
        static final String OS = "Windows 11";

        void boot();
        void shutdown();
        void runProgram();
        void connectWifi();
        void displaySpecs();
    }

