package org.example.day2.control;

public class 조건문if2 {
    public static void main(String[] args) {
        int hour = 16;

        if (hour < 11)
        {
            System.out.println("아직 멀었구나.");
        }
        else if (hour < 14)
        {
            System.out.println("좀 남았구나.");
        }
        else if (hour < 18)
        {
            System.out.println("아직 조금 남았구나.");
        }
        else {
            System.out.println("집에 가자");
        } // if 문 자체는 while 을 쓰지않음
    }
}
