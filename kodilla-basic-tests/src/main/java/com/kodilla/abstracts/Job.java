package com.kodilla.abstracts;

public abstract class Job {
    private int salary;
    private String resposibilities;

    public Job(int salary, String resposibilities) {
        this.salary = salary;
        this.resposibilities = resposibilities;
    }

    public int getSalary() {
        return salary;
    }

    public String getResposibilities() {
        return resposibilities;
    }
}