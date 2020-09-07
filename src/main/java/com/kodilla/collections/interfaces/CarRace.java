package com.kodilla.collections.interfaces;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(10);
        showCarDetails(ford);
        Opel opel = new Opel(100);
        showCarDetails(opel);
    }

    private static void showCarDetails(Car car) {
        System.out.println(car.getSpeed());
    }
        private static void doRace(Car car){
        System.out.println("increaseSpeed()");
        System.out.println("decreaseSpeed()");
    }
}