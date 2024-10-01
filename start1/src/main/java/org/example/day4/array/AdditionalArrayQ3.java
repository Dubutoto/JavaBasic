package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionalArrayQ3 {
    public static void main(String[] args) {
        //Scanner Practice
        /*
        Scanner sc = new Scanner(System.in);
        int[] save = new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자 입력:  ");
            save[i] = sc.nextInt();
        }

        int max = save[0]; // Index 0 의 값 (임시) 0보다 더작은 값이 MAX 일수 있기때문에 0으로 초기화하면 안됨.
        for (int i = 1; i < save.length; i++) {
            if (max < save[i]) { // MAX 값을 찾기위해 반복해서 갱신
                max = save[i];
            }
        }

        System.out.println("최댓값은: "+ max);
        */

        // ---- Q3
        //NextFile

        Scanner sc = new Scanner(System.in);
        //공간 확보 (변수,배열)
        int x = 0; // 학생수
        int score[] = null; //score array
        int sortedScore[] = new int[3]; //analysed array
        boolean run = true; // 프로그램 종료 여부


        //반복문 + 조건문 + Scanner
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------------------");
            System.out.println("선택> ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("학생 수> ");
                    x = sc.nextInt();
                    score = new int[x]; // null 로 지정했던 배열에 학생수만큼 배열생성
                    break;

                case 2:
                    if (score == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                    } else {
                        for (int i = 0; i < x; i++) {
                            System.out.print(score[i] + "> ");
                            score[i] = sc.nextInt();
                        }
                    }
                    break;

                case 3:
                    if (score == null) {
                        System.out.println("먼저 학생 수와 점수를 입력하세요.");
                    } else {
                        for (int i = 0; i < x; i++) {
                            System.out.print("학생"+ (i + 1)+": "+score[i] + "점 ");
                        }
                    }
                    break;

                case 4:
                    Arrays.sort(score);
                   // System.pr
            }


            //While + switch + case


            sc.close(); //스캐너 종료
        }
    }
}
