
package org.example.day1.var;

public class Basic3 {

    public static void main(String[] args)
    {
        System.out.println("Basic practice 3");
        //기본형 4가지 : 정수, 실수, 문자1, 논리
        //정수 : byte(127), short, int, long
        byte age = 120;
        short count = 25000; // short +_ 30000
        int money = 1000000; // int +_21억
        long bank = 2222222222L; //22억 대문자 L이나 소문자 l 을 넣어줘야함

       //실수 : float, double
        float weight = 79.5f; //
        double height = 188.8888; // double 은 아무것도 안붙여도 됨.

        String name = "김토토"; // 0글자이상(문자열)
        String job = "자바 프로그래머";

        // print part
        System.out.println(name+"은(는) "+age+"세 "+job+" 이다");
        System.out.println("Expected wealth 는 월 "+ money+ "이며 총자산은 "+ bank + " 이다");

    }

}
