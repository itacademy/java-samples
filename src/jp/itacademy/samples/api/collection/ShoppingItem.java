package jp.itacademy.samples.api.collection;

public class ShoppingItem {

    private String name;
    private int price;

    public ShoppingItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
