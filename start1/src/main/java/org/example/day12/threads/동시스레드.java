package org.example.day12.threads;

public class 동시스레드 {
    public static void main(String[] args) {
        Set1 t1 = new Set1();
        Set2 t2 = new Set2();
        Set3 t3 = new Set3();

        t1.start();
        t2.start();
        t3.start();
    }
}
