package com.kodilla.colletctions.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> grades = new ArrayList<>();

    public School(double... grades) {
        for (double grade : grades)
            this.grades.add(grade);
}
    @Override
    public String toString() {
        return "Grades" + grades.toString();
    }
}