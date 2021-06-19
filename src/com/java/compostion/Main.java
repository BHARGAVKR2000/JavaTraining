package com.java.compostion;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("MMS",234,"SSH");
        Wheel wheel = new Wheel("Apollo","black",25);
        Car car = new Car("BMW",4,5,engine, wheel);


        System.out.println("Car Name: "+car.getName());
        System.out.println("Car Doors: "+car.getDoors());
        System.out.println("Car Engine: "+car.getEngine().getName());
        System.out.println("Car Wheels: "+car.getWheel().getName());
    }
}
