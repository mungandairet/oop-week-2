package com.oop;

public class Student {
    
        public String name;
        public int grade;

        void updateGrade(int newGrade) {
            if(newGrade < 0 || newGrade > 100) {
                System.out.println("Invalid grade");
                return;
            }
            this.grade = newGrade;
        }
    }
    

