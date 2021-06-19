package com.java.encapsulation;

public class America extends Country{
    private String firstname;
    private String middle_name;
    private String lastname;

    public America(String firstname, String middle_name, String lastname, int age, String email) {
        super(age, email);
        this.firstname = firstname;
        this.middle_name = middle_name;
        this.lastname = lastname;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: "+firstname+" "+lastname+" "+middle_name);
        super.showInfo();
    }
}
