package com.xworkz.pakages.external;

class Student {
    private int age = 20;

    private void display() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
