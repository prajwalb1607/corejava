package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Transport;

public class Train extends Transport {

    public Train(int number) {
        super(number);
        System.out.println("Train object created");
    }

    @Override
    public void start() { System.out.println("Train departing"); }

    @Override
    public void stop() { System.out.println("Train halted"); }

    @Override
    public void accelerate() { System.out.println("Train speeding up"); }

    @Override
    public void brake() { System.out.println("Train slowing down"); }

    @Override
    public void signal() { System.out.println("Train giving horn signal"); }
}
