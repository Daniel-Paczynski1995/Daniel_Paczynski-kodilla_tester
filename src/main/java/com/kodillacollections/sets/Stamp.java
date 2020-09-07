package com.kodillacollections.sets;

import java.util.Objects;

public class Stamp {
    private String name;
    private boolean isStamped;
    private int size;

    public Stamp(String name,  boolean isStamped, int size) {
        this.name = name;
        this.isStamped = true;
        this.size = size;


    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", isStamped=" + isStamped +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return isStamped == stamp.isStamped &&
                size == stamp.size &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isStamped, size);
    }

    public int getSize() {
        return size;
    }

    public boolean isStamped() {
        return isStamped;
    }

    public String getName() {
        return name;
    }
}