package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Shape;

public class Circle extends Shape {

    @Override
    public void draw() { System.out.println("Drawing Circle"); }

    @Override
    public void calculateArea() { System.out.println("Circle Area Calculated"); }

    @Override
    public void calculatePerimeter() { System.out.println("Circle Perimeter Calculated"); }

    @Override
    public void rotate() { System.out.println("Rotating Circle"); }

    @Override
    public void resize() { System.out.println("Resizing Circle"); }


    }



