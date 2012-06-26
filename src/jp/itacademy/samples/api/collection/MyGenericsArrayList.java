package jp.itacademy.samples.api.collection;

public class MyGenericsArrayList<E> {

    private Object[] array;
    private int size;

    public MyGenericsArrayList() {
        array = new Object[10];
    }

    public void add(E e) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = e;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) array[index];
    }

    public int size() {
        return size;
    }
}
