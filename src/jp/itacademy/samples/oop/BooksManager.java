package jp.itacademy.samples.oop;

public class BooksManager {

    public static void main(String[] args) {

        Book[] books = {
            new Book("どくしゅうJava", "おにーる", 3900),
            new Book("やさしいJava", "まなたん", 2730),
            new Book("でざいんぱたーん入門", "ゆうきさん", 3990),
        };

        for (Book book : books) {
            System.out.println(book.getTitle() + 
                "(" + book.getAuthor() + ") " + book.getPrice() + "円");
        }
    }
}
