package com.kodilla.inheritance;

public class Windows extends OperatingSystem {

    public Windows() {
        super(2020);
    }
    public void turnOn() {

        System.out.println("Turned on");
    }
    public void turnOff() {
        System.out.println("Turned off");


    }
}
