package jp.itacademy.samples.basic;

public class Sum {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        System.out.println("1から100までの合計は " + sum);
    }
}
