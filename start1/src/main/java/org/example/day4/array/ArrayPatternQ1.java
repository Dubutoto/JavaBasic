package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayPatternQ1 {
    public static void main(String[] args) {
        //1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        //1-1. length 가 10인 int배열 생성
        int[] array = new int[10];
        //1-2. Random 을 이용하여 값을 넣기(범위 1~100, r.netxInt(100)+1)
        Random r = new Random();
        //     Random 의 씨앗값(seed)는 55
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
        }
        //1-3. 생성된 배열 요소 전체 출력
        System.out.println(Arrays.toString(array));


        //2. 배열에 있는 값을 꺼내어 누적
        int sum = 0;
        for (int x : array) {
            sum = sum + x;
        }
        System.out.println("전체 합계: " + sum);
        //2-1. 감소하여 누적하는 변수 minus 선언하여 초기화
        int minus = 0;
        //2-2. 배열에 있는 값을 꺼내어 계속 감소
        for (int x : array) {
            sum = sum - x;
        }
        System.out.println("감소 합계: " + minus);

        //3.배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        // 3-1. 더해서 누적하는 함수 sum선언하여 초기화
        int conSum = 0;
        // 3-2. 배열에 있는 값 중 50 보다 큰 것만 누적
        for (int x : array) {
            if (x > 50) {
                sum = sum + x;
            }
        }
        // 3-3. sum 값 출력
        System.out.println("조건 합계: " + conSum);

        //4.배열에 있는 값을 가지고 위치를 찾는 경우
        for (int i = 0; i < array.length; i++) {
            System.out.println(i); //Index
            if (array[i] > 88) {
                // 88이 하나인 경우
                System.out.println("80 보다 큰값 찾음.");
                System.out.println((i + 1) + "번째에 있음");
                break;
            }
            //4-1. 배열내에 80보다 큰 값의 위치를 맨 앞부터 하나만 찾아 위치 프린트

            //4-2. 80보다 큰 값을 찾으면 반복문 종료.
        }
    }
}
