package com.java.polymorphism;

public class Audi extends Car{
    @Override
    public void run() {
        System.out.println("Audi is Running...");
    }

    public static void stop(){
        System.out.println("Audi is Stopping..");
    }
}
