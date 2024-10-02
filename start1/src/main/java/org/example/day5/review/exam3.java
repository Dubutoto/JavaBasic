package org.example.day5.review;

import java.util.Arrays;
import java.util.Random;

public class exam3 {
    public static void main(String[] args) {
        int[] n = new int[1000];
        Random r = new Random(44);
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000)+1;
        }
        System.out.println(Arrays.toString(n));

        // 3-1
        System.out.println(n[0]+n[2]+n[4]+n[99]+n[989]);

        //3-2
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
        sum = sum + n[i];   //sum += n[i];
        }
        System.out.println("전체 합계: "+sum);

        double avg = (double) sum / n.length;
        System.out.println("평균: "+ avg);
    }
}
