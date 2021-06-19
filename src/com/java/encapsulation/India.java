package com.java.encapsulation;

public class India extends Country {

    private String firstName;
    private String lastName;
    public India(String firstName,String lastName, int age, String email) {
        super( age, email);
        this.firstName = firstName;
        this.lastName = lastName;

    }


    @Override
    public void showInfo() {
        System.out.println("Name: "+firstName+" "+lastName);
        super.showInfo();
    }
}
