package org.example.day12.threads;

public class Star extends Thread {
    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("*");
        }
    }
}
