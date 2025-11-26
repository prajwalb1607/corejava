package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.imp.*;
import com.xworkz.interfaces.interfacess.*;

public class MainRunner {
    public static void main(String[] args){

        Animal animal=new Dog();
        animal.sleep();
        animal.sound();
        animal.eating();

        System.out.println("vehicle brand===="+Vehicle.BRAND);
        System.out.println("vehicle type===="+Vehicle.TYPE);
        System.out.println("vehicle maxspeed===="+Vehicle.MAX_SPEED);
        System.out.println("vehicle wheels===="+Vehicle.WHEELS);
        System.out.println("vehicle fuel===="+Vehicle.FUEL);
        Vehicle vehicle=new Car();
        vehicle.stop();
        vehicle.start();
        vehicle.accelerate();
        vehicle.brake();
        vehicle.horn();

        System.out.println("Bank Name===="+ Bank.BANK_NAME);
        System.out.println("Branch===="+Bank.BRANCH);
        System.out.println("Currency===="+Bank.CURRENCY);
        System.out.println("Min Balance===="+Bank.MIN_BALANCE);
        System.out.println("Max Withdraw===="+Bank.MAX_WITHDRAW);

        Bank bank = new SBIBank();
        bank.openAccount();
        bank.deposit();
        bank.checkBalance();
        bank.withdraw();
        bank.closeAccount();


            System.out.println("Brand===="+ SmartPhone.BRAND);
            System.out.println("OS===="+SmartPhone.OS);
            System.out.println("RAM===="+SmartPhone.RAM);
            System.out.println("Storage===="+SmartPhone.STORAGE);
            System.out.println("5G Support===="+SmartPhone.SUPPORT_5G);

            SmartPhone phone = new SamsungPhone();
            phone.call();
            phone.internet();
            phone.message();
            phone.camera();
            phone.bluetooth();

        System.out.println("App===="+ MusicPlayer.NAME);
        System.out.println("Max Volume===="+MusicPlayer.MAX_VOLUME);
        System.out.println("Offline Support===="+MusicPlayer.OFFLINE_SUPPORT);
        System.out.println("Quality===="+MusicPlayer.AUDIO_QUALITY);
        System.out.println("Type===="+MusicPlayer.TYPE);

        MusicPlayer mp = new SpotifyPlayer();
        mp.play();
        mp.next();
        mp.pause();
        mp.previous();
        mp.stop();


        System.out.println(Computer.BRAND);
        System.out.println(Computer.PROCESSOR);
        System.out.println(Computer.RAM);
        System.out.println(Computer.STORAGE);
        System.out.println(Computer.OS);

        Computer comp = new Laptop();
        comp.boot();
        comp.runProgram();
        comp.connectWifi();
        comp.displaySpecs();
        comp.shutdown();


        System.out.println(Robot.NAME);
        System.out.println(Robot.MATERIAL);
        System.out.println(Robot.BATTERY);
        System.out.println(Robot.AI);
        System.out.println(Robot.VERSION);

        Robot robot = new ServiceRobot();
        robot.move();
        robot.speak();
        robot.scan();
        robot.lift();
        robot.recharge();


        System.out.println(Resturant.NAME);
        System.out.println(Resturant.LOCATION);
        System.out.println(Resturant.TYPE);
        System.out.println(Resturant.TABLES);
        System.out.println(Resturant.RATING);

      Resturant rest = new Hotel();
        rest.welcomeCustomer();
        rest.takeOrder();
        rest.serveFood();
        rest.prepareBill();
        rest.cleanTable();


        System.out.println(Student.SCHOOL);
        System.out.println(Student.GRADE);
        System.out.println(Student.SECTION);
        System.out.println(Student.MAX_MARKS);
        System.out.println(Student.CITY);

        Student st = new HighSchoolStudent();
        st.study();
        st.attendClass();
        st.writeExam();
        st.submitHomework();
        st.participateActivity();
    }
    }

