package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Tool;

public class DrillMachine extends Tool {

    public DrillMachine(int power) {
        super(power);
        System.out.println("DrillMachine object created");
    }

    @Override
    public void start() { System.out.println("Drill machine start"); }

    @Override
    public void stop() { System.out.println("Drill machine stop"); }

    @Override
    public void rotate() { System.out.println("Drill rotating"); }

    @Override
    public void drill() { System.out.println("Drilling hole"); }

    @Override
    public void maintain() { System.out.println("Maintaining drill machine"); }
}

