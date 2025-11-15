package com.xworkz.tostring.internal;

import com.xworkz.tostring.external.Car;

public class MainRunner  {
    public static void main(String[] args){
        Car car=new Car();
        System.out.println(car.toString());

        Car c=new Car("Tesla", "Model S", 2024, "Red", 85000);
        System.out.println(c.toString());
        System.out.println(car=c);


        System.out.println(c.equals(c));


        Employee emp = new Employee();
        System.out.println(emp.toString());
        Employee emp1 = new Employee(101, "Arun", "Developer", 60000, "Infosys");
        System.out.println(emp1.toString());


        Teacher t = new Teacher();
        System.out.println(t.toString());
        Teacher t1 = new Teacher(1, "Ravi", "Maths", 10, 75000);
        System.out.println(t1.toString());


        Book book = new Book();
        System.out.println(book.toString());
        Book book1 = new Book("Java Basics", "James", "TechPress", 500, 499.0);
        System.out.println(book1.toString());
        System.out.println(book1=book);
        System.out.println(book1.equals(book1));

        Mobile mob = new Mobile();
        System.out.println(mob.toString());
        Mobile mob1 = new Mobile("Samsung", "S24", 256, 108, 90000);
        System.out.println(mob1.toString());
        System.out.println(mob.equals(mob));
        System.out.println(mob=mob1);


        Movie m = new Movie();
        System.out.println(m.toString());
        Movie m1 = new Movie("Inception", "Sci-Fi", "Nolan", 2010, 9.0);
        System.out.println(m1.toString());
        System.out.println(m1=m);
        System.out.println(m1.equals(m));

        Bike b=new Bike();
        System.out.println(b.toString());
        Bike b1=new Bike(10000,"Hero",100,"blue");
        System.out.println(b1.toString());
        System.out.println(b=b1);
        System.out.println(b1.equals(b));


    }
}
