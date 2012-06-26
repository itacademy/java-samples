package jp.itacademy.samples.api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("コマンドを入力してください");
            System.out.println("1)書籍登録 2)書籍確認 3)終了");

            int command = scanner.nextInt();
            switch (command) {
            case 1:
                System.out.println("書籍名・著者名・価格をスペースで区切って入力してください");
                String title = scanner.next();
                String author = scanner.next();
                int price = scanner.nextInt();
                books.add(new Book(title, author, price));
                System.out.println("書籍『" + title + "』を登録しました");
                break;
            case 2:
                System.out.println(books.size() + "件登録されています");
                for (Book book : books) {
                    System.out.println(" - " + book);
                }
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("そんなコマンドありません");
            }
            System.out.println();
        }

    }

}
