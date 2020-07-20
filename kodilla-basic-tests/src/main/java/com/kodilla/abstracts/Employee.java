package com.kodilla.abstracts;

public class Employee extends Person {
    public Employee(String firstName, int age, Job job) {
        super(firstName, age, job );
    }


    public String giveResposibilities() {
     return getJob().getResposibilities();
    }
}
