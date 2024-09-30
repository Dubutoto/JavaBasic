package org.example.day4.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayPptQ {
    public static void main(String[] args) {
        // Q1
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int countInc = 0;
        int countMain = 0;

        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) {
                countMain++;
            }

            if (term1[i] < term2[i]) {
                countInc++;
            }
        }
        System.out.println("향상된 학생수 " + countInc + "명");
        System.out.println("현상유지 학생수 " + countMain + "명");
/*
        // Q2
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자 입력>>");
        int firstN = scanner.nextInt();
        System.out.print("숫자 입력>>");
        int secondN = scanner.nextInt();
        System.out.print("숫자 입력>>");
        int thirdN = scanner.nextInt();

        System.out.println("합계: "+(firstN+secondN+thirdN));
        System.out.println("평균: "+(firstN+secondN+thirdN)/3);
*/
        //Q3
        Random random = new Random(44);
        int[] n = new int[1000];
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(1000) + 1; // 1~ 1000
        }
        System.out.println((n[0]+n[2]+n[4]+n[99]+n[989]));


        //Q4
        System.out.println("---------가고 싶은곳 List--------");
        System.out.println("1. 백두산 | 2. 한라산 | 3. 후지산");
        System.out.println("------------------------------");
        System.out.println("입력> ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println("당신이 가고싶은 백두산은 열차를 타고 가야합니다.");
        } else if (x == 2) {
            System.out.println("당신이 가고싶은 한라산은 배를 타고 가야합니다.");
        } else if (x == 3) {
            System.out.println("당신이 가고싶은 후지산은 비행기를 타고 가야합니다.");
        } else {
            System.out.println("잘못 입력 하셨습니다.");
        }

        //Q5
        Random random2 = new Random(555);
        int q5[]= new int[1000];
        for (int i = 0; i < q5.length; i++) {
            n[i] = random2.nextInt(100) + 1; // 1~ 100
        }

        int count1 = 0; // upper 80
        int count2 = 0; // 70~79
        int count3 = 0; // 50~69
        int count4 = 0; // under 49
        for (int i = 0; i < n.length; i++) {
            if(n[i] > 80) {
                count1++;
            }

            if( n[i] <= 79 && n[i] >= 70 ) {
                count2++;
            }

            if( n[i] <= 69 && n[i] >= 50 ) {
                count3++;
            }

            if( n[i] < 49) {
                count4++;
            }
        }

        System.out.println("80이상: "+count1+"개");
        System.out.println("70~79: "+count2+"개");
        System.out.println("50~69: "+count3+"개");
        System.out.println("49미만: "+count4+"개");
    }
}


