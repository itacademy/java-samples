package jp.itacademy.samples.api.concurrent;

public class ThreadSample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Count10("Thread-1"));
        thread1.start();
        System.out.println("Thread-1 has started");
        
        Thread thread2 = new Thread(new Count10("Thread-2"));
        thread2.start();
        System.out.println("Thread-2 has started");
    }

    private static class Count10 implements Runnable {

        private String name;

        Count10(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(name + ": " + i);
            }
        }
    }
}
