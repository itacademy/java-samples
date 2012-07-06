package jp.itacademy.samples.api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderSample3 {

    public static void main(String[] args) throws Exception {

        try (BufferedReader reader = new BufferedReader(new FileReader(
                "C:/Users/itacademy/sample.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
