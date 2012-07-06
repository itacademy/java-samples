package jp.itacademy.samples.api.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderSample1 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/itacademy/sample.txt"));

        String line = reader.readLine();
        System.out.println(line);

        line = reader.readLine();
        System.out.println(line);

        line = reader.readLine();
        System.out.println(line);

        reader.close();
    }
}
