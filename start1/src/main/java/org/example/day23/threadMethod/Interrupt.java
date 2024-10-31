package org.example.day23.threadMethod;

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread is sleeping...");
            Thread.sleep(5000); // 5초 대기
            System.out.println("Thread is awake!");
        } catch (InterruptedException e) {
            // 인터럽트 발생 시 처리 코드 작성
            System.out.println("내가 깨어났다....");
        }
    }
}

public class Interrupt {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("오류");
        }
        t.interrupt();
    }
}
