package jp.itacademy.samples.api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {

    private List<ShoppingItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public List<ShoppingItem> getAllItems() {
        return Collections.unmodifiableList(items);
    }

    public void clear() {
        items = new ArrayList<>();
    }

    public int getAmount() {
        int amount = 0;
        for (ShoppingItem item : items) {
            amount += item.getPrice();
        }
        return amount;
    }
}
