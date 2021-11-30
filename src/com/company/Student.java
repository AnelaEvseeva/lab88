package com.company;

public class Student extends People {
    Student(){
        super();
    }
    Student(String nameW, String lastnameW, int ageW){
        super(nameW, lastnameW, ageW);
    }
    @Override
    void walk(){
        System.out.println("Student " + name + " walk");
    }
    void learn(){
        System.out.println("Student " + name + " learn");
    }
}
