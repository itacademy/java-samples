package jp.itacademy.samples.oop.deco;

public class DecoStrong extends DecoratedString {

    public DecoStrong(String str) {
        super(str);
    }

    public String decorate() {
        return "<strong>" + str + "</strong>";
    }
}
