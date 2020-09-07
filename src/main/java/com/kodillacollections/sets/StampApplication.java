package com.kodillacollections.sets;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Mieszko 1", true, 1));
        stamps.add(new Stamp("Zygmunt Stary", false, 4));
        stamps.add(new Stamp("Boleslaw Chrobry",true,1));
        stamps.add(new Stamp("Boleslaw Chrobry",true,1));
        stamps.add(new Stamp("Mieszko 1",false,1));

        System.out.println(stamps.size());
        for (Stamp stamp:stamps)
            System.out.println(stamp);
            
        }
    }
