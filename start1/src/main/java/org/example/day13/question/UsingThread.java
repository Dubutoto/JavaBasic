package org.example.day13.question;


public class UsingThread {
    public static void main(String[] args) {
       TimeThread timeThread = new TimeThread();
       EvenThread evenThread = new EvenThread();

        timeThread.start();
        evenThread.start();
    }
}
