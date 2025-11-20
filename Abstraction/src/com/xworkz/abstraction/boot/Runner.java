package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.abstracts.Abstracts;

public class Runner {

        public static void main(String[] args) {





            Car obj1 = new Car(20000);
            obj1.start();
            obj1.accelerate();
            obj1.brake();
            obj1.stop();
            obj1.horn();
            obj1.name();
            Car.brand();

            Dog obj = new Dog("Dog");
            obj.eat();
            obj.sleep();
            obj.walk();
            obj.sound();
            obj.run();
            obj.start();
            Dog.end();


            Fan fan = new Fan("hgasf");
            fan.turnOn();
            fan.increaseSetting();
            fan.showStatus();
            fan.decreaseSetting();
            fan.turnOff();
            fan.name();
            Fan.price();


            Circle circle = new Circle();
           circle.draw();
            circle.calculateArea();
         circle.calculatePerimeter();
       circle.rotate();
        circle.resize();

            SavingsAccount account = new SavingsAccount("prajwal");
        account.openAccount();
          account.deposit();
       account.checkBalance();
      account.withdraw();
       account.closeAccount();
       account.balance();
       SavingsAccount.update();

            Mobile mobile = new Mobile(10000);
          mobile.powerOn();
          mobile.showInfo();
          mobile.update();
       mobile.restart();
         mobile.powerOff();
         mobile.price();
         Mobile.storage();

            House house = new House(10000);
         house.openGate();
        house.clean();
         house.paint();
       house.maintain();
       house.closeGate();
       house.budget();
       House.rent();



            Developer developer = new Developer(10000);
        developer.work();
          developer.attendMeeting();
          developer.takeBreak();
      developer.report();
      developer.logout();
      developer.start();
      Developer.end();


            SmartWatch sw = new SmartWatch(5000);
            sw.turnOn();
            sw.trackSteps();
            sw.showTime();
            sw.notifyAlerts();
            sw.turnOff();
            sw.info();
            SmartWatch.brand();

            Atm atm = new Atm(101);
            atm.start();
            atm.process();
            atm.alert();
            atm.stop();
            atm.shutdown();
            atm.details();
            Atm.usage();

            Train t = new Train(2025);
            t.start();
            t.accelerate();
            t.brake();
            t.stop();
            t.signal();
            t.info();
            Train.type();

            DrillMachine d = new DrillMachine(800);
            d.start();
            d.rotate();
            d.drill();
            d.stop();
            d.maintain();
            d.info();
            DrillMachine.category();

            PythonCourse pc = new PythonCourse(40);
            pc.enroll();
            pc.start();
            pc.study();
            pc.giveExam();
            pc.getCertificate();
            pc.description();
            PythonCourse.medium();
        }
}




