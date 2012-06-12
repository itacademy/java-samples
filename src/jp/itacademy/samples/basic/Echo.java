package jp.itacademy.samples.basic;

import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
    }
}
