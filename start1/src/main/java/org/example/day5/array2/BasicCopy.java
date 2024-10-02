package org.example.day5.array2;

public class BasicCopy {
    public static void main(String[] args) {
        //기본형 복사: 변수에 들어있는 값을 다른 변수에 넣어주는 것.
        int math1 = 100;
        int math2 = math1;

        math2 = 96;
        System.out.println(math1+" "+math2);
    }
}
