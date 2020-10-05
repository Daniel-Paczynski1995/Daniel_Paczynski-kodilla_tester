package com.kodilla.parametrized_tests.homework;

class InvalidNumbersException extends Exception {
    public InvalidNumbersException() {
        super("Wrong numbers provided");
    }
}