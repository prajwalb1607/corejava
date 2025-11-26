package com.xworkz.interfaces.interfacess;

public interface Bank {

        public static final String BANK_NAME = "SBI";
        public static final String BRANCH = "Bangalore";
        public static final String CURRENCY = "INR";
        public static final int MIN_BALANCE = 1000;
        public static final int MAX_WITHDRAW = 25000;

        public abstract void deposit();
        public abstract void withdraw();
        public abstract void openAccount();
        public abstract void closeAccount();
        public abstract void checkBalance();
    }

