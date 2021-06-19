package com.java.compostion;

public class Wheel {
    private String name;
    private String color;
    private int inch;

    public Wheel(String name, String color, int inch) {
        this.name = name;
        this.color = color;
        this.inch = inch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}
