package jp.itacademy.samples.api.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.itacademy.samples.oop.Book;

public class MapSample {
    
    private static final int MAX_VALUE = 2000000000;

    public static void main(String[] args) {
        
        Map<String, Book> books = new HashMap<>();
        
        Book book = new Book("本1", "著者A", 1200);
        books.put(book.getTitle(), book);

        book = new Book("本2", "著者B", 1300);
        books.put(book.getTitle(), book);

        book = new Book("本3", "著者C", 1400);
        books.put(book.getTitle(), book);
        
        Book hon2 = books.get("本2");
        System.out.println(hon2);
        
        
        List<Book> list = new ArrayList<>();
        list.add(new Book("本1", "著者A", 1200));
        list.add(new Book("本2", "著者B", 1300));
        list.add(new Book("本3", "著者C", 1400));
        
        for (Book b : list) {
            if (b.getTitle().equals("本2")) {
                System.out.println(b);
                break;
            }
        }
    }
}
