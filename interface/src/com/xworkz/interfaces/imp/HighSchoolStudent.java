package com.xworkz.interfaces.imp;

import com.xworkz.interfaces.interfacess.Student;
   public class HighSchoolStudent implements Student {

        public void study() { System.out.println("Studying for exam."); }
        public void writeExam() { System.out.println("Writing exam."); }
        public void submitHomework() { System.out.println("Homework submitted."); }
        public void attendClass() { System.out.println("Class attended."); }
        public void participateActivity() { System.out.println("Participating in activity."); }
    }

