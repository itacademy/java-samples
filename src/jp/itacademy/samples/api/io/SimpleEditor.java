package jp.itacademy.samples.api.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleEditor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        try (FileWriter writer = new FileWriter("C:/Users/itacademy/output.txt")) {
            while (in.hasNextLine()) {
            }

        } catch (IOException e) {
            System.out.println("ファイルを開けませんでした");
        }
    }
}
