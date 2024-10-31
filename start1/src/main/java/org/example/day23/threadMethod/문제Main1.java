package org.example.day23.threadMethod;

class Sum {
    private int sum = 0;

    public Sum() {
    }

    // synchronized 메서드로 동기화
    public synchronized void sum(int n) {
        sum += n;
    }

    public int getSum() {
        return sum;
    }
}



public class 문제Main1 {
    public static void main(String[] args) throws InterruptedException {
        Sum get = new Sum(); // Sum 객체 생성

        // 스레드1은 1부터 100까지
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                get.sum(i);
            }
        });

        // 스레드2는 2부터 200까지
        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 200; i++) {
                get.sum(i);
            }
        });

        // 스레드 시작
        t1.start();
        t2.start();

        // 스레드가 끝날 때까지 대기
        t1.join();
        t2.join();

        // 최종 sum 값 출력
        System.out.println("최종 합계: " + get.getSum());
    }
}
