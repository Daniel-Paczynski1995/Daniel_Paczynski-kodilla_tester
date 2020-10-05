package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {
   @ParameterizedTest
   @CsvFileSource(resources = "Number.csv", numLinesToSkip = 1)
   public void shouldThrowExceptionWhenInvalidNumber(Set<Integer> textNumber, int value) {
// given
      GamblingMachine gamblingMachine = new GamblingMachine();
      //When,then
      Assertions.assertThrows(NumberFormatException.class, () -> {
         gamblingMachine.howManyWins(textNumber);
      });
   }
}

