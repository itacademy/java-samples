package jp.itacademy.samples.basic;

import java.util.Scanner;

public class ToughCustomer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int price;
        
        // 前回入力した価格を格納しておく変数。
        // 入力価格がこれより高いと文句を言われるのだが、
        // 初回入力時には比較対象となる前回が存在しないので、
        // どんな値を入力されても文句を言わないよう、
        // int型で可能な最大の数を初期値としておく。
        int prev = Integer.MAX_VALUE;

        while (true) {
            price = scanner.nextInt();
            if (price < 1000) {
                break;
            }
            if (price > prev) {
                System.out.println("なんでさっきより高いねん");
                continue;
            }
            System.out.println("高いなあ、もうちょっとまけてーな");
            prev = price;
        }
        System.out.println("ちょっと高いけどその値段で買ったるわ");
    }
}
