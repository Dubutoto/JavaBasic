package org.example.review;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
// Scanner: Java에서 Standard Input 으로부터 데이터를 읽기 위해 제공되는 클래스.

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 >>");
        String name = sc.nextLine();
        System.out.print("나이 입력>>");
        int age = sc.nextInt(); // String --> int

        System.out.println(name+" "+age);
        sc.close(); //마지막에 꼭 해줘야함. 메모리 누수방지
    }
}
