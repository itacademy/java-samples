package jp.itacademy.samples.oop.deco;

public class DecoStar extends DecoratedString {

    protected DecoStar(String str) {
        super(str);
    }

    public String decorate(String str2) {
        return "★" + str + "★";
    }
}
