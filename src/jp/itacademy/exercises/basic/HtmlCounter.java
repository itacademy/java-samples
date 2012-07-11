package jp.itacademy.exercises.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class HtmlCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        LinkedList<Integer> digits = new LinkedList<>();
        do {
            digits.push(num % 10);
        } while ((num = num / 10) != 0);
        
        for (int digit : digits) {
            System.out.printf("<img src=\"img/%s.gif\">", digit);
        }
    }

}
