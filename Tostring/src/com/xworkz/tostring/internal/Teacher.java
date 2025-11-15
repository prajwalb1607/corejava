package com.xworkz.tostring.internal;

public class Teacher {

        public int id;
        public String name;
        public String subject;
        public int experience;
        public double salary;

        public Teacher() {
            System.out.println("no args constructor");
        }

        public Teacher(int id, String name, String subject, int experience, double salary) {
            System.out.println("all args constructor");
            this.id = id;
            this.name = name;
            this.subject = subject;
            this.experience = experience;
            this.salary = salary;
        }

        public String toString() {
            return "Teacher [ID=" + id + ", Name=" + name + ", Subject=" + subject +
                    ", Experience=" + experience + " years, Salary=" + salary + "]";
        }
    }


