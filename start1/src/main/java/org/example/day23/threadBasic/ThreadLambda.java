package org.example.day23.threadBasic;

public class ThreadLambda {
    public static void main(String[] args) {

        //lambda 사용
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <100; i++) {
                System.out.println("==> 나는 별!!!");
            }
        });

        //익명 클래스 사용  (이외에 다른 방법도 숙지)
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("B");
                }

            }
        });

        t1.start();
        t2.start();
    }

}
