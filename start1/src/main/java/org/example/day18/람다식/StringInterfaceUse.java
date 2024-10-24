package org.example.day18.람다식;

public class StringInterfaceUse {
    public static void main(String[] args) {
        //구현해보기
        StringInterface x = (str) -> str.toUpperCase();

        String result = x.convert("hello world");
        System.out.println(result);
    }
}
