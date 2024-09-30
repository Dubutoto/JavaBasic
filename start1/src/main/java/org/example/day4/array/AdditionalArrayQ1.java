package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class AdditionalArrayQ1 {
    public static void main(String[] args) {

        // ----Q1
        Random random = new Random();
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("정렬 전: " + Arrays.toString(array)); // 비파괴 함수

        // 배열 정렬
        Arrays.sort(array); //파괴 함수
        System.out.println("정렬 후: " + Arrays.toString(array));

        int minValue = array[0];
        int maxValue = array[array.length - 1];

        System.out.println("최솟값: " + minValue);
        System.out.println("최댓값: " + maxValue);

        // ----Q2
        int[] xArray = new int[10];
        for (int i = 0; i < xArray.length; i++) {
            xArray[i] = random.nextInt(50) + 1; // 1~ 50
        }

        int[] yArray = new int[10];
        for (int i = 0; i < yArray.length; i++) {
            yArray[i] = random.nextInt(50) + 51; // 51~ 100
        }

        Arrays.sort(xArray);
        Arrays.sort(yArray);

        System.out.println(Arrays.toString(xArray));
        System.out.println(Arrays.toString(yArray));

        System.out.println(xArray[xArray.length]+yArray[yArray.length]);
        System.out.println(xArray[0]+yArray[0]);

        // ---- Q3
        //NextFile

    }
}
