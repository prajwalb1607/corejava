package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Employee;

public class Developer extends Employee {

    @Override
    public void work() { System.out.println("Developer Writing Code"); }

    @Override
    public void attendMeeting() { System.out.println("Developer in Meeting"); }

    @Override
    public void takeBreak() { System.out.println("Developer Taking Break"); }

    @Override
    public void report() { System.out.println("Developer Submitting Report"); }

    @Override
    public void logout() { System.out.println("Developer Logged Out"); }

    public Developer(int salary){
        super(salary);
    }


    }

