package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Wyniesc smieci", LocalDate.of(2020,12,9), LocalDate.of(2020,12,9)));
        tasks.add(new Task("Spotkac sie z Kuba",LocalDate.of(2020,9,15),LocalDate.of(2020,9,15)));

        return tasks;
    }


}
