package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.Set;


public class Warehause {
    private Set<Order> orders = new HashSet<>();

    public Order getOrders(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(v -> v.getNumber()
                        .equals(number))
                .findFirst().orElseThrow(OrderDoesntExistException::new);


    }
public void  addOrder(Order order){
orders.add(order);
    }

}
