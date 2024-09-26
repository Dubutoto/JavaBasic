
package org.example.day2.review;

public class Test1
{
    public static void main(String[] args)
    {
    //기본형 변수를 정리 - 정수, 실수, 문자1 논리
        float temp = 23.5f; // double 을 사용해도 ㄱㅊ
        byte date = 26; // -128 ~ 127
        final char DAY = '목'; // single count
        boolean food = true; // T or F


        String roomNo = "강의장 6호";

        System.out.println("현재 온도: "+temp);
        System.out.println("날짜: "+date);
        System.out.println("요일: "+DAY);
        System.out.println("음식 여부: "+food);
        System.out.println("강의실 위치: "+roomNo);

    }
}
