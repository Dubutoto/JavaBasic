package org.example.day3.repeat;

import java.util.Date;

public class While1 {
    public static void main(String[] args) {
        //finite repeat --> 시작값, 조건, 증감값
        int i = 1; // 시작값
        // int add = 1; // 증감값
        while (i <= 10) { //조건
            System.out.println(i);
          i++; //  i = i + add ;
        } // while

        for(int j = 1; j<=10; j++){
          System.out.println(j);
        }

        while(true){ // 조건 boolean(논리형데이터) 결과
            System.out.println("Running");
            Date date = new Date();
            int seconds = date.getSeconds();
            if(seconds > 109 ){
                break;
            }
        }
    }
}
