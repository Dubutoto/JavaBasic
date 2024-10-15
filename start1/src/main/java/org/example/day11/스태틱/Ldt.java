package org.example.day11.스태틱;

import java.time.LocalDateTime;

public class Ldt {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusWeeks(2);

        System.out.println(start);
        System.out.println(end);

        if(start.isBefore(end)){
            System.out.println("아직 대여중입니다.");
        }else{
            System.out.println("종료일입니다.");
        }
    }
}
