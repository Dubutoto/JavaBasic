package org.example.day5.review;

import java.util.Scanner;

public class VoteQ {
    public static void main(String[] args) {
        String[] name = {"아이유","유재석","방탄"};
        int[] tv = new int[3];
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("----------------인기투표--------------");
            System.out.println("1. 아이유 | 2. 유재석 | 3. BTS | 4. 종료");
            System.out.println("------------------------------------");
            System.out.printf("선택> ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("아이유가 한표 획득!");
                    tv[0]++;
                    break;
                case 2:
                    System.out.println("유재석이 한표 획득!");
                    tv[1]++;
                    break;
                case 3:
                    System.out.println("BTS가 한표 획득!");
                    tv[2]++;
                    break;
                case 4:
                    System.out.println("종료합니다");
                    run = false;  // 루프 종료를 위해 플래그를 false로 설정
                    break;
                default:
                    System.out.println("Invalid choice!");
            } //switch
        } //while

        int sum = 0;
        for (int i = 0; i < tv.length; i++) {
            sum = sum  + tv[i];
        }
        System.out.println("아이유: "+tv[0]+"표");
        System.out.println("유재석: "+tv[1]+"표");
        System.out.println("BTS: "+tv[2]+"표");
        System.out.println("전체투표수: "+sum+"표");

        sc.close();
    }
}
