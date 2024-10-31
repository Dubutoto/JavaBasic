package org.example.day23.threadMethod;

public class Priority {
    public static void main(String[] args) {
        // 높은 우선순위를 가진 스레드
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("High Priority Thread");
            }
        });
        highPriorityThread.setPriority(Thread.NORM_PRIORITY); // 우선순위를 최대로 설정

        // 낮은 우선순위를 가진 스레드
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Low Priority Thread");
            }
        });
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // 우선순위를 최소로 설정

        // 스레드 시작
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
