package com.company;

public class Teacher extends People {
    Teacher(){
        super();
    }
    Teacher(String nameW, String lastnameW, int ageW) {
        super(nameW, lastnameW, ageW);
    }
    @Override
    void walk(){
        System.out.println("Teacher " + name + " walk");
    }
    void teach(){
        System.out.println("Teacher " + name + " teach");
    }
}
