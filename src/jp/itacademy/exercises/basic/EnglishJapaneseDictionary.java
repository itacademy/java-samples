package jp.itacademy.exercises.basic;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishJapaneseDictionary {

    public static void main(String[] args) throws IOException {

        Map<String, String> dict = new HashMap<>();
        
        try (InputStream in = EnglishJapaneseDictionary.class.getResourceAsStream("dictionary.txt")) {
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] pair = line.split(":");
                dict.put(pair[0].trim(), pair[1].trim());
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String en = scanner.nextLine();
            String ja = dict.get(en);
            if (ja == null) {
                System.out.println("わかりませんごめんなさい！");
            } else {
                System.out.println(ja + "！");
            }
        }
    }

}
