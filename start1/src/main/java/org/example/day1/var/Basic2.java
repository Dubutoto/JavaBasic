package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");

        //기본형 4가지 : 정수, 실수, 문자1, 논리
        //가을이다 관련된 데이터를 기본형으로 4가지
        // 상수 추가 -> final을 붙임. 변수명 대문자! (값 변경불가)

            int month = 9;
            double temp = 21.1;
            final char COLOR = 'b'; // char 은 한글자만 가능
            boolean rain = false;


            System.out.println("달은 "+month);
            System.out.println("온도는 "+temp);
            System.out.println("색은 "+COLOR);
            System.out.println("비가 오나 "+rain);

            int nowTime = 0; // initializing
                nowTime = 17;
            System.out.println(nowTime);


    }
}
