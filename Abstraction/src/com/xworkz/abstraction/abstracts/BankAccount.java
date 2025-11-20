package com.xworkz.abstraction.abstracts;

public abstract class BankAccount {
    public void balance(){
        System.out.println("balance in the acccount");
    }
    public static void update(){
        System.out.println("update of the account");
    }
    public abstract void deposit();
    public abstract void withdraw();
    public abstract void checkBalance();
    public abstract void openAccount();
    public abstract void closeAccount();

    String name;


    public BankAccount(String name){
        this();
        this.name=name;
        System.out.println("name of the account holder");
    }

    public BankAccount(){

    }
}


