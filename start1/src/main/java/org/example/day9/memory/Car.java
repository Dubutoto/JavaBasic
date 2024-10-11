package org.example.day9.memory;

public class Car {
    //필드 2개    ==> 멤버변수, 전역변수(자동초기화)
    int size;
    int speed;

    //메서드 2개  ==> 멤버메서드
    public String print(){
        return size + " " + speed;  //중간에 "" 가 있어서 String 으로 사용가능
                                    //size 와 speed 는 전역변수, 자동초기화
    }

    public void hi(){
        // 메서드 정의 --> 실행되지 않음, 호출했을 때 실행!
        int temp = 10; //지역변수(초기화X), 기본형
        System.out.println("속도를 up!!" + temp);
        // 내 클래스내에서는 함수와 변수를 마음대로 불러서
        // 쓸수 있다.
        // 외부에서는 참조형 변수필요!
        System.out.println(print());
    }
}
