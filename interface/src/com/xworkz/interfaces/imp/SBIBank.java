package com.xworkz.interfaces.imp;


import com.xworkz.interfaces.interfacess.Bank;

public class SBIBank implements Bank {

        public void deposit(){ System.out.println("Amount Deposited in SBI"); }
        public void withdraw(){ System.out.println("Amount Withdrawn from SBI"); }
        public void openAccount(){ System.out.println("Account Opened in SBI"); }
        public void closeAccount(){ System.out.println("Account Closed in SBI"); }
        public void checkBalance(){ System.out.println("Balance Checking..."); }
    }





