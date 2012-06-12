package jp.itacademy.samples.basic;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            int indent = height - 1 - i;
            for (int j = 0; j < indent; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
