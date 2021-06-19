package com.java.encapsulation;

public class Japan extends Country{
    private String firstName;
    private String lastName;

    public Japan(int age, String email, String firstName, String lastName) {
        super(age, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: "+ lastName +" "+firstName);
        super.showInfo();
    }
}
