package jp.itacademy.samples.api.io;

import java.io.File;
import java.util.Scanner;

public class FileReaderSample4 {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(new File("C:/Users/xiaofan/input.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
