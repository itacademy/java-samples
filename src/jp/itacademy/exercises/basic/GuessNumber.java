package jp.itacademy.exercises.basic;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    
    public static void main(String[] args) {
        
        int ans = new Random().nextInt(100) + 1;
        
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            count++;
            int guess = scanner.nextInt();
            if (ans < guess) {
                System.out.println("もっと小さいです");
            } else if (ans > guess) {
                System.out.println("もっと大きいです");
            } else {
                System.out.println("正解！　" + count + "回目で正解しました。");
                break;
            }
        }
    }

}
