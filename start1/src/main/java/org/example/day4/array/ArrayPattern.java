package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayPattern {
    public static void main(String[] args) {
        //1.배열을 만들고 나중에 반복문으로 데이터 많이 넣기. Additionally Ramdom version
        int[] score = new int[5]; // {0,0,0,0,0}
         Random random = new Random(); // 아무값이나 만들어주는 부품
        for (int i = 0; i < score.length; i++) {
            // String data = JOptionPane.showInputDialog("i번째 수(저장값)"); //입력값은 모두 String
            score[i] = random.nextInt(100)+1;
            // score[i] = Integer.parseInt(data);
            // 복습할때 추가
        }
        // 랜덤 버전 따로 생성
        System.out.println(Arrays.toString(score)); // 배열의 단순 출력. 배열 --> 문자열


        //2.배열에 있는 값을 꺼내어 누적
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        System.out.println("전체 합계: "+sum);
        double avg = sum / score.length;
        System.out.println("평균: "+avg);

        for (int x : score){
            sum = sum + x;
            // 앞의 sum: 새값까지 누적된 값
            // 뒤의 sum: 이전까지 더해진 값
        }

        //3.배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        // 300 보다 큰경우만 누적

        int condSum = 0;
        for (int i = 0; i < score.length; i++) {
            if(score[i] > 40) {
                condSum = condSum + score[i];
            }
        }


        System.out.println("전체 합계: "+condSum);
        double avg2 = condSum / score.length;
        System.out.println("평균: "+avg2);

        //코드 포맷팅 Ctrl + ALT + L

        //4.배열에 있는 값을 가지고 위치를 찾는 경우(CodingTest)
        for (int i = 0; i < score.length; i++) {
            System.out.println(i); // 배열의 index
            if(score[i]==88){
                // 88이 하나인 경우
                System.out.println("88찾음.");
                System.out.println((i+1)+"번째에 있음");
               break;
            }
        }
    }
}
