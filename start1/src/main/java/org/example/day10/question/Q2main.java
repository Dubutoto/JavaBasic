package org.example.day10.question;

public class Q2main {
    public static void main(String[] args) {
        Q2class day1 = new Q2class("자바공부",10,"강남");
        Q2class day2 = new Q2class("여행",15,"강원도");
        Q2class day3 = new Q2class("운동",11,"피트니스");
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);

        System.out.println("Total time: " + Q2class.getTotalTime() + " hours");
        System.out.println("Average time: " + Q2class.getAvgTime() + " hours");
    }
}
