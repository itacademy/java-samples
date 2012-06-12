package jp.itacademy.samples.oop;

public class Pot {
    
    private double totalQuantity;
    
    public void addWater(double quantity) {
        totalQuantity += quantity;
    }
    
    public double getQuantity() {
        return totalQuantity;
    }

}
