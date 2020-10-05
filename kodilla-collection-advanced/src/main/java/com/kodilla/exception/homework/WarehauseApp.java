package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;

public class WarehauseApp {
    public static void main(String[] args) {
        Warehause warehause = new Warehause();
        warehause.addOrder(new Order("25"));
        warehause.addOrder(new Order("35"));
        warehause.addOrder(new Order("30"));
        warehause.addOrder(new Order("15"));

        try {
            warehause.getOrders("18");
            System.out.println("Znaleziono zamowienie");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie znaleziono zamowienia");
        }
    }
}