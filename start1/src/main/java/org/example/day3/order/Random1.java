package org.example.day3.order;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random r = new Random(); // 아무값을 만들어 주는 클래스
        r.setSeed(100); // 시드값

        //반목문을 만들때는 유한반복, 무한반복
        for(int i = 0; i < 100; i++){

        int num = r.nextInt(100);// ±21억 bound:100 의 경우 1~99
        int num2 = num + 1;// ±21억 bound:100 의 경우 1~99

        System.out.println(num);
        System.out.println(num2);
        }
    }
}
