package org.example.day2.control;

import java.util.Scanner;

public class 입력연습3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //정수 2개를 입력받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        System.out.print("나의 이름은?>> ");
        String name = sc.next();
        System.out.print("나의 키는>> ");
        double height = sc.nextDouble();
        System.out.print("나의 몸무게는>> ");
        double weight = sc.nextDouble();
        System.out.print("나는 저녁을 먹었나요? >>");
        boolean dinner = sc.nextBoolean();
        sc.nextLine();
        System.out.print("나의 좌우명은? >>");
        String say = sc.nextLine();

        System.out.println("내 이름은 "+name+" 입니다.");
        System.out.println("내 내년 키는"+height+" 입니다.");
        System.out.println("내 내년 몸무게는"+weight+" 입니다.");
        System.out.println("나는 저녁을"+dinner+" 했습니다.");
        System.out.println("나의 좌우명은"+say+" 입니다.");
    //하나씩 입력, swing으로 여러개 한방에 입력하는것이 다음 파일.
        sc.close();
    }
}
