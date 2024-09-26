package org.example.day2.control;

import java.util.Scanner;

public class BasicQ4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("여행 지역을 입력하세요: ");
        String str = sc.next();
        System.out.print("1인당 경비를 입력하세요: ");
        int x = sc.nextInt();
        System.out.print("여행인원을 입력하세요: ");
        int y = sc.nextInt();
        System.out.print("할인률(%)을 입력하세요: ");
        int z = sc.nextInt();
        System.out.print("VIP 여부 (true/false): ");
        boolean vip = sc.nextBoolean();
        sc.nextLine();
        System.out.print("당부의 말을 입력하세요: ");
        String say = sc.nextLine();

        System.out.println("여행 지역: " + str);
        System.out.printf("1인당 경비: %d\n", x);
        System.out.printf("기본 할인율: %d%%\n", z);

        double dis = z;

        if (vip) {
            dis += 5;
            System.out.println("VIP 추가 할인율: 5%");
        }

        double total = x * y;
        double discountAmount = total * (dis / 100); // 할인 금액 계산
        double totalAfterDiscount = total - discountAmount; // 할인 후 총 경비

        System.out.printf("최종 할인율: %.1f%%\n", dis);
        System.out.printf("총 경비: %.1f\n", total);
        System.out.printf("할인 금액: %.1f\n", discountAmount);
        System.out.printf("할인 후 총 경비: %.1f\n", totalAfterDiscount);
        System.out.println("당부의 말: " + say);
        sc.close();
    }
}
