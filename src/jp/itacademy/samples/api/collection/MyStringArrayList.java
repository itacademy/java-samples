package jp.itacademy.samples.api.collection;

public class MyStringArrayList {

    private String[] array;
    private int size;

    public MyStringArrayList() {
        array = new String[10];
    }

    public void add(String s) {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = s;
        size++;
    }

    public String get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }
}
