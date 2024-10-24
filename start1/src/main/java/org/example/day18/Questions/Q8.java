package org.example.day18.Questions;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {

        // 홀수만 필터링후 합
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr)
                .filter(n -> n % 2 != 0)
                .sum();
        System.out.println("홀수의 합: " + sum);

        //가장 큰 값
        int[] arr2 = {5, 3, 10, 40, 2};
        int max = Arrays.stream(arr2)
                .max() // 가장 큰 값 찾기
                .getAsInt();
        System.out.println("가장 큰 값: " + max);


        int[] arr3 = {1, 2, 2, 5, 5, 6, 7, 7, 9, 10};
        Arrays.stream(arr3)
                .filter(n -> n > 5)
                .distinct()
                .forEach(n -> System.out.print(n+" "));
    }
}

