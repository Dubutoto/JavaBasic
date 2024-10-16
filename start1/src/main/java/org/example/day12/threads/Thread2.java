package org.example.day12.threads;

public class Thread2 extends Thread {
    public void run() {
        for (int i = 1000; i >0 ; i--) {
            System.out.println("감소>> " + i);
            
        }
    }
}
