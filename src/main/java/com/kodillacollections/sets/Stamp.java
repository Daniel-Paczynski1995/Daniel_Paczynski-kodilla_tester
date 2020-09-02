package com.kodillacollections.sets;

import java.util.Objects;

public class Stamp {
    private String name;
    private String information;
    private int size;

    public Stamp(String name, String information, int size) {
        this.name = name;
        this.information = information;
        this.size = size;


    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return information;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return size == stamp.size &&
                Objects.equals(name, stamp.name) &&
                Objects.equals(information, stamp.information);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, information, size);
    }
}