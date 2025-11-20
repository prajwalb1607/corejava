package com.xworkz.abstraction.abstracts;

public abstract class Course {

    public void description() {
        System.out.println("This is an educational course");
    }

    public static void medium() {
        System.out.println("Course medium: English");
    }

    public abstract void enroll();
    public abstract void start();
    public abstract void study();
    public abstract void giveExam();
    public abstract void getCertificate();

    int duration;

    public Course(int duration) {
        this();
        this.duration = duration;
        System.out.println("Course duration: " + duration + " hours");
    }

    public Course() {
        System.out.println("Course default constructor");
    }
}

