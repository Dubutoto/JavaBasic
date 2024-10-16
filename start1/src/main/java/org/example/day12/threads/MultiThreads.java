package org.example.day12.threads;

public class MultiThreads {
    public static void main(String[] args) {
        Star s = new Star();
        Name n = new Name();

        s.start(); //start-->
        n.start();
    }
}
