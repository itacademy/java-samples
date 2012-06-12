package jp.itacademy.samples.oop;

public class PotUser {
    
    public static void main(String[] args) {
        
        Pot pot = new Pot();
        pot.addWater(1.25);
        pot.addWater(0.5);
        
        System.out.println("現在の水量: " + pot.getQuantity());
    }
}
