package com.kodilla.optional;

import com.kodilla.stream.homework.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski",  new Teacher("Marek Nowak")));
        students.add(new Student("Daniel Paczynski", new Teacher("Mateusz Ryndak")));
        students.add(new Student(" Szymon Iksinski", null));

        for (Student student : students) {

            String message = "Uczen : " + student.getName() + ", Nauczyciel :  " + Optional.ofNullable(student.getTeacher()).map(v->v.getName()).orElse("undefindet");
            System.out.println(message);
        }

    }
}