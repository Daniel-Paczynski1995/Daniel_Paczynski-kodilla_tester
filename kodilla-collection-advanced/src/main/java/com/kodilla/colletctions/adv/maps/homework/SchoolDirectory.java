package com.kodilla.colletctions.adv.maps.homework;

import com.kodilla.colletctions.adv.maps.complex.Grades;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, Grades> school = new HashMap<>();
        Principal marek = new Principal("Marek", "Mostowiak", "Politechnika Poznaska");
        Principal walter = new Principal("Walter", "White", "Heigh school in Albuqerki");
        Principal jan = new Principal("Jan", "Kowalski", "Uniwesytet Adama Mickiewicza");

        Grades marekgrades = new Grades(83, 25);
        Grades waltergrades = new Grades(150, 70);
        Grades jangrades = new Grades(70, 25);


        school.put(marek, marekgrades);
        school.put(walter, waltergrades);
        school.put(jan, jangrades);
    }
}