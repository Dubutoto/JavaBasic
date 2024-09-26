package org.example.day2.control;

import java.util.Scanner;

public class 입력연습2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //정수 2개를 입력받아서 첫번째 숫자가 두번째 숫자보다 큰지 비교해서 출력
        System.out.print("첫번째 정수 입력>>");
        int firstN = sc.nextInt();
        System.out.print("두번째 정수 입력>>");
        int secondN = sc.nextInt();

        // 더 큰 수를 비교하여 출력
        if (firstN > secondN) {
            System.out.println("더 큰 수는 " + firstN + " 입니다");
        } else if (firstN < secondN) {
            System.out.println("더 큰 수는 " + secondN + " 입니다");
        } else {
            System.out.println("두 수는 같습니다");
        }
        sc.close();
    }
}
