package com.lab.assignment.car;

public class Car{
    String color, type;
    int displacement, speed;
    boolean sunroof;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void hasSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    public boolean hasSunroof() {
        return this.sunroof;
    }
}
