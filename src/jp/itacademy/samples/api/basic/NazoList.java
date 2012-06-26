package jp.itacademy.samples.api.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NazoList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hoge");
        list.add("piyo");
        list = Collections.unmodifiableList(list); // 変更できないリストに変換
        System.out.println(list.getClass());
    }
}
