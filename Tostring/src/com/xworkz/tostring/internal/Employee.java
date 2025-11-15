package com.xworkz.tostring.internal;



    public class Employee {
        public int empId;
        public String name;
        public String role;
        public double salary;
        public String company;

        public Employee() {
            System.out.println("no args constructor");
        }

        public Employee(int empId, String name, String role, double salary, String company) {
            System.out.println("all args constructor");
            this.empId = empId;
            this.name = name;
            this.role = role;
            this.salary = salary;
            this.company = company;
        }

        public String toString() {
            return "Employee [ID=" + empId + ", Name=" + name + ", Role=" + role +
                    ", Salary=" + salary + ", Company=" + company + "]";
        }
    }


