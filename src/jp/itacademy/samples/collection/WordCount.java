package jp.itacademy.samples.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {

        String sentence = "A skunk sat on a stump and thunk the stump stunk but the stump thunk the skunk stunk";
        Map<String, Integer> words = new HashMap<>();

        Scanner scanner = new Scanner(sentence);
        while (scanner.hasNext()) {
            String word = scanner.next();
            word = word.toLowerCase();
            Integer count = words.get(word);
            if (count == null) {
                count = new Integer(1);
            } else {
                count = new Integer(count + 1);
            }
            words.put(word, count);
        }

        for (Map.Entry<String, Integer> e : words.entrySet()) {
            System.out.println(e.getKey() + " ... " + e.getValue());
        }
    }

}
