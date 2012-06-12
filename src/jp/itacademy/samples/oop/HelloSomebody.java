package jp.itacademy.samples.oop;

public class HelloSomebody {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("パラメータを1つ指定してください");
            return;
        }
        System.out.println("Hello " + args[0] + " !!");
    }
}
