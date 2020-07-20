package com.kodilla.basic_assertion;

import basic_assertion.Calculator;
import basic_assertion.ResultChecker;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator1 = new Calculator();
        int subtractResult = calculator1.subtract(a, b);
        correct = ResultChecker.assertEquals(-3, subtractResult);

        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        Calculator calculator2 = new Calculator();
        int multiplicationResult = calculator2.multiplication(a, b);
         correct = ResultChecker.assertEquals(40, multiplicationResult);

        if (correct) {
            System.out.println("Metoda mltiplication działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda multiplication nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
}




