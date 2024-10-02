package org.example.day5.review;

import java.util.Scanner;

public class exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] location = {"백두산","한라산","후지산"};
        String[] trans = {"열차","배","비행기"};

        System.out.println("--------가고싶은곳 보기: 1)"+location[0]+" 2)"+location[1]+" 3)"+location[2]+"-------");
        System.out.printf("숫자 입력 > ");
        int n = scanner.nextInt();

        if(n == 1) {
            System.out.println("당신이 가고싶은 " + location[0] + "은 " +trans[0] + " 를 타고 가야합니다");
        }else if (n == 2) {
            System.out.println("당신이 가고싶은 "+location[1]+"은 "+trans[1]+" 를 타고 가야합니다");
            }
            else{
            System.out.println("당신이 가고싶은 "+location[2]+"은 "+trans[2]+" 를 타고 가야합니다");
            }

            scanner.close();
    }
}
