package com.kodilla.stream.homework;

import java.util.stream.Stream;

public class UsersManager {
    public static void main(String[] args) {
        UserRepository.getUsersList()
                .stream()
                .map(u -> u.getUsername());

    }
}