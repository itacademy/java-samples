package jp.itacademy.samples.exception;

public class StackTrace {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        int[] array = new int[10];
        array[10] = 123;
    }
}
