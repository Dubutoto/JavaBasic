package org.example.day23.threadBasic;

public class ThreadMain3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                        System.out.println("나는 달러");
                }
            }
        };
        t1.start();
    }
}
