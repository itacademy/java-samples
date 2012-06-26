package jp.itacademy.samples.api.collection;

import java.util.Iterator;

public class MyIterableArrayList<E> implements Iterable<E> {

    private Object[] array;
    private int size;

    public MyIterableArrayList() {
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

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E> {

        private int pointer;

        private Itr() {
        };

        @Override
        public boolean hasNext() {
            return pointer < size;
        }

        @Override
        public E next() {
            return get(pointer++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        MyIterableArrayList<String> list = new MyIterableArrayList<>();
        list.add("hoge");
        list.add("huga");
        list.add("piyo");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
