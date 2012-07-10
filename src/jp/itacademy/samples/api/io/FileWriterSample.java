package jp.itacademy.samples.api.io;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterSample {

    public static void main(String[] args) throws Exception {

        try (PrintWriter writer = new PrintWriter("C:/Users/xiaofan/output.txt")) {
            writer.println("abcde");
            writer.println("12345");
            writer.println("あいうえお");
            System.out.println("ファイルに出力しました");
        } catch (IOException e) {
            System.out.println("ファイルを開けませんでした");
        }
    }
}
