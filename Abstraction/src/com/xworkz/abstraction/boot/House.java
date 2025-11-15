package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Building;

public class House extends Building {

    @Override
    public void openGate() { System.out.println("House Gate Opened"); }

    @Override
    public void closeGate() { System.out.println("House Gate Closed"); }

    @Override
    public void clean() { System.out.println("House is Cleaned"); }

    @Override
    public void paint() { System.out.println("House Painted"); }

    @Override
    public void maintain() { System.out.println("House Maintenance Done"); }



    }


