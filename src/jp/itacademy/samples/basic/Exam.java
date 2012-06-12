package jp.itacademy.samples.basic;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 70) {
            System.out.println("合格！");
        } else {
            System.out.println("不合格！");
        }
    }
}
