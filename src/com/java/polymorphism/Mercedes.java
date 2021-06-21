package com.java.polymorphism;

public class Mercedes extends Car{
    @Override
    public void run() {
        System.out.println("Mercedes is Running");
    }

    public static void stop(){
        System.out.println("Mercedes is Stopping..");
    }
}
