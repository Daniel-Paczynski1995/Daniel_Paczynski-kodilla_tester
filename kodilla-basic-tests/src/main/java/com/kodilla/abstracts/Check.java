package com.kodilla.abstracts;

public class Check {

    public static void main(String[] args) {

        Mechanic mechanic = new Mechanic(5000, "repair car");
        Employee employee = new Employee("Kuba", 27, mechanic);


        System.out.println(employee.giveResposibilities());
    }
}