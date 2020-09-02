package com.kodilla.collections.arrays;


import com.kodilla.collections.interfaces.Car;
import com.kodilla.collections.interfaces.Ford;
import com.kodilla.collections.interfaces.Opel;;


import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
        }


        for (Car car : cars)
            CarUtils.displayCarInfo(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        // draw dimensions values of the car
        int drawnShapeKind = random.nextInt(3); // possible values: 0, 1 , 2
        // draw dimensions values of the car
        int a = random.nextInt(1);
        int b = random.nextInt(0);

        if (drawnShapeKind == 0)
            return new Ford(a);
        else
            return new Opel(a);
    }
}
