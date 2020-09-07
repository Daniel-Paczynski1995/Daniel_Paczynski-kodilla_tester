package com.kodilla.colletctions.adv.maps.complex;

import java.util.Objects;

public class Student {
    private String firtname;
    private String lastname;




    public Student(String firtname, String lastname) {
        this.firtname = firtname;
        this.lastname = lastname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firtname, student.firtname) &&
                Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firtname, lastname);
    }


    public String getFirtname() {
        return firtname;


    }

    public String getLastname() {
        return lastname;
    }

}