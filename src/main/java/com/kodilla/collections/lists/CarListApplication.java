package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Car;
import com.kodilla.collections.interfaces.Ford;
import com.kodilla.collections.interfaces.Opel;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;


public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Opel opel = new Opel(100);
        cars.add(opel);
        cars.add(new Ford(110));

        cars.remove(1);
        cars.remove(opel);
        System.out.println(cars.size());
        for (Car car : cars) {
            System.out.println(car + "Ford");
        }
    }
}
