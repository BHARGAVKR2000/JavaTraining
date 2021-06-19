package com.java.inheritace;

public class Student extends Person{
    private int rollnumber;

    public Student(String name, int age, String email, int rollnumber){
        super(name, age, email);  // call's the super class constructor i'e Person class
        this.rollnumber = rollnumber;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("RollNo: "+rollnumber);
    }

    @Override
    public void duty() {
        super.duty();
    }
}

