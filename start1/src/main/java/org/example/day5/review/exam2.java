package org.example.day5.review;

import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자입력 :");
        int x = scanner.nextInt();
        System.out.printf("숫자입력 :");
        int y = scanner.nextInt();
        System.out.printf("숫자입력 :");
        int z = scanner.nextInt();

        int sum = x+y+z;
        double avg = (double)(x+y+z)/3;

        System.out.println("---------------------------");
        System.out.println("합계: "+sum);
        System.out.println("평균: "+avg);
    }
}
