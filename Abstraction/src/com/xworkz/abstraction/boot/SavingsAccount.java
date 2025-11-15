package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.BankAccount;

public class SavingsAccount extends BankAccount {

    @Override
    public void deposit() { System.out.println("Depositing into Savings Account"); }

    @Override
    public void withdraw() { System.out.println("Withdrawing from Savings Account"); }

    @Override
    public void checkBalance() { System.out.println("Savings Account Balance"); }

    @Override
    public void openAccount() { System.out.println("Savings Account Opened"); }

    @Override
    public void closeAccount() { System.out.println("Savings Account Closed"); }



    }



