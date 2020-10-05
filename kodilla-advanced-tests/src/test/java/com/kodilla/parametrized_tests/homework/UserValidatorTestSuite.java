package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UserValidatorTestSuite {

   private UserValidator userValidator = new UserValidator();


   @ParameterizedTest
   @CsvSource(value = {"dpaczka87@gmail.com", "DANIEL@gmial.com"})
   public void shouldReturnTrueIfMailIsGood(String email) {
      boolean result = userValidator.validateEmail(email);
      assertTrue(result);
   }
   @ParameterizedTest
   @CsvSource(value = { "@gmial.com", "1   "})
   public void shouldReturnFalseIfMailIsBad(String email) {
      boolean result = userValidator.validateEmail(email);
      assertFalse(result);
   }
}
