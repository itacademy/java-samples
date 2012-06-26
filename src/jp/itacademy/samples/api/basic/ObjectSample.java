package jp.itacademy.samples.api.basic;

import java.util.Scanner;

public class ObjectSample {

    public static void main(String[] args) {

        Object obj1 = new Object();
        System.out.println(obj1.getClass());
        System.out.println(obj1.toString());
        System.out.println(obj1.hashCode());

        Object obj2 = "中身は実はStringオブジェクト";
        System.out.println(obj2);

        Object obj3 = new Scanner(System.in);
        System.out.println(obj3);
        // obj3.nextLine(); これは呼び出せない
    }
}
