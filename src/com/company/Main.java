package com.company;

public class Main {

    public static void main(String[] args) {
	People p = new People();
    p.walk();
    People p2 = new People();
    p2.walk();
    Student student = new Student();
    student.learn();
    People st = new Student();
    Teacher teacher = new Teacher();
    teacher.teach();
    People tch = new Teacher();
    }
}
