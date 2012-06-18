package jp.itacademy.samples.oop;

import jp.itacademy.samples.oop.car.Car;

public class Drive {

    public static void main(String[] args) {

        Car car = new Car();
        car.addGas(4);
        car.drive();

        car = new Truck();
        car.addGas(4);
        car.drive();
    }
}
