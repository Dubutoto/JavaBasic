package org.example.day6.practice;

import java.util.Random;
import java.util.Scanner;

public class MovieRank {
    public static void main(String[] args) {
        Random random = new Random();
        String[] arrayTitle={"인사이드 아웃2","데드풀과 울버린","너의 이름은","콰이어트 플레이스","초속 5센티미터"};
        int[] arrayView={10900,10900,1200,5500,1540};
        Scanner scanner = new Scanner(System.in);

        System.out.println("네이버 시리즈온 실시간 영화 목록: ");
        for(int i=0;i<arrayTitle.length;i++) {
            System.out.println((i+1)+": " + arrayTitle[i]+"- 조회수: "+arrayView[i]);
        }
        System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요"+"("+1+"-"+arrayTitle.length+")");
        int x = scanner.nextInt();

        switch(x) {
            case 1:
                System.out.println("1: " + arrayTitle[0]+"- 조회수: "+arrayView[0]);
                break;
            case 2:
                System.out.println("2: " + arrayTitle[1]+"- 조회수: "+arrayView[1]);
                break;
            case 3:
                System.out.println("3: " + arrayTitle[2]+"- 조회수: "+arrayView[2]);
                break;
            case 4:
                System.out.println("4: " + arrayTitle[3]+"- 조회수: "+arrayView[3]);
                break;
            case 5:
                System.out.println("5: " + arrayTitle[4]+"- 조회수: "+arrayView[4]);
                break;
            default:
        }
        scanner.close();
        }
}

