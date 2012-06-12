package jp.itacademy.samples.basic;

public class Cast1 {

    public static void main(String[] args) {

        // 20打数7安打の打率は？
        int bats = 20;
        int hits = 7;
        double rate = hits / bats;
        System.out.println("打率: " + rate);

        // 1年は何ミリ秒か？
        System.out.println(1000 * 60 * 60 * 24 * 365);
    }
}
