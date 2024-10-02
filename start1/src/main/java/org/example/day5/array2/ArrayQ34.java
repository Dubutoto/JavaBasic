package org.example.day5.array2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQ34 {
    public static void main(String[] args) {
        //Q3
        Scanner sc = new Scanner(System.in);
        //공간 확보 (변수,배열)
        int studentNum = 0; // 학생수
        int score[] = null; //score array
        double avg = 0;
        boolean run = true; // 프로그램 종료 여부

        //반복문 + 조건문 + Scanner
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
            System.out.println("-----------------------------------------------------");
            System.out.printf("선택> ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("학생 수> ");
                    studentNum = sc.nextInt();
                    if (studentNum <= 0) {
                        System.out.println("학생 수는 1명 이상이어야 합니다.");
                    } else {
                        score = new int[studentNum]; // 학생 수만큼 배열 생성
                    }
                    break;

                case 2:
                    if (score == null) {
                        System.out.println("먼저 학생 수를 입력하세요.");
                    } else {
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print("학생"+(i+1)+" 의 점수" + "> ");
                            score[i] = sc.nextInt();
                        }
                    }
                    break;

                case 3:
                    if (score == null) {
                        System.out.println("먼저 학생 수와 점수를 입력하세요.");
                    } else {
                        for (int i = 0; i < studentNum; i++) {
                            System.out.print("학생"+ (i + 1)+": "+score[i] + "점 ");
                        }
                    }
                    break;

                case 4:
                    if (score == null || studentNum == 0) {
                        System.out.println("먼저 학생 수와 점수를 입력하세요.");
                    } else {
                        // 분석 코드 실행
                        Arrays.sort(score);
                        int sum = 0;
                        for (int i = 0; i < studentNum; i++) {
                            sum += score[i];
                        }
                        avg = sum/(double)studentNum;
                        System.out.println("최고점수: "+score[studentNum - 1]);
                        System.out.println("평균점수: "+avg);
                        break;
                    }


                case 5:
                    System.out.println("종료합니다");
                    run = false;  // 루프 종료를 위해 플래그를 false로 설정
                    break;

                default:
                    System.out.println("Invalid choice!");

            }


            //While + switch + case
        }
        sc.close(); //스캐너 종료
    }
}
