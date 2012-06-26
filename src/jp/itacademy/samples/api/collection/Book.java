package jp.itacademy.samples.api.collection;

public class Book {

    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "『" + title + "』 " + author + " 著 （" + price + "円）";
    }
}
