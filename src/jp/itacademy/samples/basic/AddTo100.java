package jp.itacademy.samples.basic;

import java.util.Scanner;

public class AddTo100 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (sum < 100) {
            int i = scanner.nextInt();
            sum = sum + i;
            System.out.println("現在の合計値: " + sum);
        }

        System.out.println("合計が100を超えました");
    }
}
