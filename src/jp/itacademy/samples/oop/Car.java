package jp.itacademy.samples.oop;

public class Car {

    private int gas;

    public void addGas(int gas) {
        this.gas += gas;
    }

    public void drive() {
        int km = gas * getFuelCost();
        for (int i = 0; i < km; i++) {
            System.out.print(getWheelRuts());
        }
        System.out.println();
    }

    // 燃費 1リットルあたり何km走れるか
    public int getFuelCost() {
        return 20;
    }

    // タイヤの跡
    public char getWheelRuts() {
        return ':';
    }
}
