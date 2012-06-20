package jp.itacademy.samples.oop.deco;

public class DecoStrong extends DecoratedString {

    protected DecoStrong(String str) {
        super(str);
    }

    public String decorate(String str) {
        return "<strong>" + str + "</strong>";
    }
}
