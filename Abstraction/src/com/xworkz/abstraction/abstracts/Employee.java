package com.xworkz.abstraction.abstracts;

public abstract class Employee {

    public void start(){
        System.out.println("start working");
    }
    public static void end(){
        System.out.println("end working");
    }
    public abstract void work();
    public abstract void attendMeeting();
    public abstract void takeBreak();
    public abstract void report();
    public abstract void logout();

    int salary;

    public Employee(int salary){
        this();
        this.salary=salary;
        System.out.println("salary of the employee is ="+salary);

    }
    public Employee(){

    }

}
