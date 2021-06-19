package com.java.encapsulation;

public class Main {
    public static void main(String[] args) {
        India india = new India("Ravi","Kumar",23,"ravikumar@gmail.com");
        America america = new America("James","Richard","smith",34,"james@gmail.com");
        Japan japan = new Japan(21,"itsuki@gmail.com","itsuki","nanako");

        india.showInfo();
        System.out.println("*********************");
        america.showInfo();
        System.out.println("*********************");
        japan.showInfo();

    }
}
