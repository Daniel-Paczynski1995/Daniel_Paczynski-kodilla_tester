package com.kodilla.exception.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    void testExpectedException() {
// given
        Warehause warehause = new Warehause();

        //when,then


        Assertions.assertThrows(OrderDoesntExistException.class, () -> {
            warehause.getOrders("a,b,c,d");
        });
    }
}