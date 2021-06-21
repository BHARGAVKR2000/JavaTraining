package com.java.polymorphism;
// BMW will pretend like car
public class BMW extends Car{
    @Override
    public void run(){
        System.out.println("BMW is Running");
    }

    //Static methods cannot be overridden
    public static void stop(){
        System.out.println("Car is Stopping..");
    }
}
