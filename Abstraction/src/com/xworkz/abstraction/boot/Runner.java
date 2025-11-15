package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Abstracts;

public class Runner {

        public static void main(String[] args) {





            Car obj1 = new Car();
            obj1.start();
            obj1.accelerate();
            obj1.brake();
            obj1.stop();
            obj1.horn();

            Dog obj = new Dog();
            obj.eat();
            obj.sleep();
            obj.walk();
            obj.sound();
            obj.run();


            Fan fan = new Fan();
            fan.turnOn();
            fan.increaseSetting();
            fan.showStatus();
            fan.decreaseSetting();
            fan.turnOff();

            Circle circle = new Circle();
           circle.draw();
            circle.calculateArea();
         circle.calculatePerimeter();
       circle.rotate();
        circle.resize();

            SavingsAccount account = new SavingsAccount();
        account.openAccount();
          account.deposit();
       account.checkBalance();
      account.withdraw();
       account.closeAccount();

            Mobile mobile = new Mobile();
          mobile.powerOn();
          mobile.showInfo();
          mobile.update();
       mobile.restart();
         mobile.powerOff();

            House house = new House();
         house.openGate();
        house.clean();
         house.paint();
       house.maintain();
       house.closeGate();
        }
}




