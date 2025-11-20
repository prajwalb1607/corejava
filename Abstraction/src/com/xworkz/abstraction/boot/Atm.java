package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Machine;

public class Atm extends Machine {

    public Atm(int id) {
        super(id);
        System.out.println("ATM object created");
    }

    @Override
    public void start() { System.out.println("ATM starting"); }

    @Override
    public void stop() { System.out.println("ATM stopped"); }

    @Override
    public void process() { System.out.println("Processing transaction"); }

    @Override
    public void alert() { System.out.println("ATM alert sound"); }

    @Override
    public void shutdown() { System.out.println("ATM shutdown"); }
}

