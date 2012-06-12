package jp.itacademy.samples.basic;

public class Average {

    public static void main(String[] args) {

        int[] scores = { 90, 65, 72, 100, 85 };

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.println("平均点: " + average);
    }
}
