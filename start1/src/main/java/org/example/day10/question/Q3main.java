package org.example.day10.question;

public class Q3main {
    public static void main(String[] args) {
        Q3class work1 = new Q3class("홍길동", 25, "여");
        Q3class work2 = new Q3class("김길동", 24, "남");
        Q3class work3 = new Q3class("송길동",26,"여");

        System.out.println("직원수: "+ work1.count);
        System.out.println(work1);
        System.out.println(work2);
        System.out.println(work3);

        System.out.println(Q3class.totalAge/work1.count);
    }
}
