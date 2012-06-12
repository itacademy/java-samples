package jp.itacademy.samples.basic;

import java.util.Scanner;

public class Uranai {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String bloodType = scanner.nextLine();

        switch (bloodType) {
        case "A":
            System.out.println("だいきちー");
            break;
        case "B":
            System.out.println("ちょうだいきちー");
            break;
        case "O":
            System.out.println("まあまあー");
            break;
        case "AB":
            System.out.println("だいきょうー　がーん！");
            break;
        default:
            System.out.println("そんな血液型ないですからー");
            break;
        }
    }
}
