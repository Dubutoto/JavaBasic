package org.example.day12.threads;

public class Set1 extends Thread {
    public void run() {
        for (int i = 1; i <= 500; i++) {
            System.out.println(i);
        }
    }
}
