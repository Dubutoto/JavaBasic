package org.example.day5.review;

import java.util.Arrays;
import java.util.Random;

public class exam5 {
    public static void main(String[] args) {
     Random r = new Random(555);
     int[] x = new int[1000];
     int[] count= {0,0,0,0};

     for (int i = 0; i < x.length; i++) {
         x[i] = r.nextInt(100)+1;
     } // 배치 for

     for (int i = 0; i < x.length; i++) {
         if(x[i]>=80){
             count[0]++;
         }
         if(x[i]>=70&&x[i]<=79){
             count[1]++;
         }
         if(x[i]>=50&&x[i]<=69){
             count[2]++;
         }
         if(x[i]>49){
             count[3]++;
         }
     } // for
     System.out.println("배열 전체: "+ Arrays.toString(x));
     System.out.println("80이상인 개수: "+count[0]);
     System.out.println("70~79인 개수: "+count[1]);
     System.out.println("50~69인 개수: "+count[2]);
     System.out.println("49보다 큰 개수: "+count[3]);
    } // main
} // class
