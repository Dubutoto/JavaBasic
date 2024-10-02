package org.example.day5.array2;

import java.util.Arrays;
import java.util.Scanner;

public class StringQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호입력(-포함)>>");
        String num = scanner.nextLine();
        String sNum = num.trim();
        System.out.println("공백제거번호:"+sNum);

    String[] numArray=sNum.split("-"); //review
    System.out.println(Arrays.toString(numArray));

    //통신사 분류
        if(numArray[0].equals("011")){
            System.out.println("SK");
        } else if(numArray[0].equals("019")){
            System.out.println("LG");
        } else {
            System.out.println("Apple");
        }
    //연식 분류
        if(numArray[1].length()>=4){
            System.out.println("최신폰");
        }  else {
            System.out.println("올드폰");
        }

    //번호 유효성 검사
        int totalLength = 0;
        // for 문의 기본 형태로 배열의 모든 요소의 길이를 합산
        for (int i = 0; i < numArray.length; i++) {
            totalLength += numArray[i].length();
        }

        if(totalLength>=10){
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

    }
}
