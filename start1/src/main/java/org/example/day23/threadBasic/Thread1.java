package org.example.day23.threadBasic;

public class Thread1 extends Thread {
    //start() -> 동시에 실행할 목록으로 이 스레드도 넣어주세요
    //run() -> 동시에 실행해주는 내용

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                System.out.println("*");
                sleep(500);
            } catch (Exception e) {
                System.out.println("스레드 재우기를 시도하다가 문제 발생");
            }
        }
    }
}
