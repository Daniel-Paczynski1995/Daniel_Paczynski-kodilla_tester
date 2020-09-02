package com.kodillacollections.sets;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mieszko 1", "Blocked", 2 - 2));
        stamps.add(new Stamp("Zygmunt Stary", "Blocked", 3 - 3));
        stamps.add(new Stamp("Boleslaw Chrobry","Blocked",1-1));

    System.out.println(stamps.size());
        for (Stamp stamp:stamps)
            System.out.println(stamp);
            
        }
    }
