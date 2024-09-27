package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        //3 번 환영합니다 출력
        for(int i=0; i<3; i++){
            System.out.println("Welcome");
        }

        //숫자를 100부터 200까지출력
        for(int j=100; j<201; j++){
            System.out.println(j);
        }

        //Random 한 정수값 5개 출력(범위는 0~99)
        Random r = new Random(); // 아무값을 만들어 주는 클래스
        for(int k=0; k<5; k++){
            int num = r.nextInt(100);// ±21억 bound:100 의 경우 0~99
            System.out.println(num);
        }
    }
}
