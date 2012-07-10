package jp.itacademy.samples.api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderSample2 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/xiaofan/input.txt"));

        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }
}
