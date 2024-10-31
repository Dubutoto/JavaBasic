package org.example.day23.threadBasic;

public class ThreadMainInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("G");
                }
            }
        });



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("B");
                }

            }
        });

        t1.start();
        t2.start();
    }

}
