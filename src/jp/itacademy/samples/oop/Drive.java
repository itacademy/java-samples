package jp.itacademy.samples.oop;

public class Drive {

    public static void main(String[] args) {

        Car car = new Car();
        car.addGas(5);
        car.drive();

        car = new Truck();
        car.addGas(5);
        car.drive();
    }
}
