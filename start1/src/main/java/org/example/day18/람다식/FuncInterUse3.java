package org.example.day18.람다식;

//3. 람다식(람다함수, 익명함수)으로 바로 구현해서 사용하는 방법
public class FuncInterUse3 {
    public static void main(String[] args) {
      FuncInter my = () -> System.out.println("hello");

        my.my메서드();
    }// 메인
}//클래스
