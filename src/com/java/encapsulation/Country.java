package com.java.encapsulation;

public class Country {

    private int age;
    private String email;

    public Country( int age, String email) {
        this.age = age;
        this.email = email;
    }

    public void showInfo(){
        System.out.println("Age: "+age);
        System.out.println("Email_id: "+email);
    }
}
