package org.example.day23.threadBasic;

public class ThreadMain2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new InitThread());
        Thread t2 = new Thread(new InitThread2());

        t1.start();
        t2.start();
    }
}
