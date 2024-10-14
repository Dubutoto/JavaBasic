package org.example.day9.chracterFile;

public class UsingAccount {
    public static void main(String[] args) {
        //인스턴스 변수 --> 3개
        //인스턴스 변수는 생성된 객체(클래스의 인스턴스)의 실제값(인스턴스)을
        //저장하기 위한 변수
        //==>객체 생성할때마다 힙영역에 생긴다.!
        AccountData dad = new AccountData("홍길동","050505", 10000);
        System.out.println(dad);
        System.out.println(dad.count); //1
        AccountData me = new AccountData("코코넛","001024",2031232121);
        System.out.println(me); //2
        System.out.println(me.count); //2
    }
}

// 인스턴스 vs 스태틱 변수
