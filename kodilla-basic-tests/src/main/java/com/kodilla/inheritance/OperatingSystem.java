package com.kodilla.inheritance;

public class OperatingSystem {
private int year;

public OperatingSystem(int year){
this.year = year;
}

    public OperatingSystem() {

    }

    public void turnOn() {

    System.out.println("Turned on");
    }
    public void turnOff() {
        System.out.println("Turned off");
    }
    public int getYear() {
        return this.year;
    }
}
