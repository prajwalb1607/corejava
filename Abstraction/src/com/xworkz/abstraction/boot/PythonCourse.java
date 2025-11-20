package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Course;

public class PythonCourse extends Course {

    public PythonCourse(int duration) {
        super(duration);
        System.out.println("PythonCourse object created");
    }

    @Override
    public void enroll() { System.out.println("Enrolled in Python course"); }

    @Override
    public void start() { System.out.println("Python course started"); }

    @Override
    public void study() { System.out.println("Studying Python modules"); }

    @Override
    public void giveExam() { System.out.println("Giving Python exam"); }

    @Override
    public void getCertificate() { System.out.println("Received Python certificate"); }
}
