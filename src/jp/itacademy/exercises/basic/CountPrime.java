package jp.itacademy.exercises.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CountPrime {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            numbers.add(i);
        }

        List<Integer> primes = new ArrayList<>();

        while (!numbers.isEmpty()) {
            int prime = numbers.pop();
            primes.add(prime);
            for (Iterator<Integer> itr = numbers.iterator(); itr.hasNext();) {
                if (itr.next() % prime == 0) {
                    itr.remove();
                }
            }
        }

        for (int prime : primes) {
            System.out.println(prime);
        }
    }

}
