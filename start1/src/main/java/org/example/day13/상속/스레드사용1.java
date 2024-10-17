package org.example.day13.상속;

public class 스레드사용1 {
    public static void main(String[] args) {
        //스레드 사용 3가지 단계
        //1. 스레드 상속받아 클래스 정의
        //2.
        //3.
        CounterThread c = new CounterThread();
        ArrayThread a = new ArrayThread();
        TimeThread t = new TimeThread();

        c.start();
        a.start();
        t.start();
    }
}
