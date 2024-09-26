package org.example.day2.control;

import java.util.Scanner;

public class 입력연습1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력>>");
        String name = sc.next();
        System.out.print("나이 입력>>");
        int age = sc.nextInt(); // String --> int
        System.out.print("몸무게 입력>>");
        double w = sc.nextDouble(); // String --> double

        System.out.println(name+" "+age+" "+w);
        sc.close();
    }
}
