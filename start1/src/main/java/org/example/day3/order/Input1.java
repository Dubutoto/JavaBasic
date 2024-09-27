package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        //입력
        //ram에 있어야함
        int x = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 입력>>"); //print(), printf()
        int age = sc.nextInt(); // 모든 입력은 타입을 컴퓨터는 String 으로 인식 -> int로 변환해줘야함
        System.out.print("아침을 먹었는지 입력(true/false)?");
        boolean result = sc.nextBoolean();

        String text = null;
        if (result) {
            text = "Great!";
        } else {
            text = "Bad!";
        }

        //처리
        int nextAge = age + 1;

        //출력
        System.out.println("내년 나이는 "+nextAge+" 입니다.");
        System.out.println(text);

        sc.close();
    }

}
