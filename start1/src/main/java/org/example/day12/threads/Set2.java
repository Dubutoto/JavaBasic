package org.example.day12.threads;

import java.util.Date;

public class Set2 extends Thread {
    public void run() {
        Date date = new Date();
        for (int i = 1; i <= 3000; i++) {
            System.out.println(date);
        }
    }
}
