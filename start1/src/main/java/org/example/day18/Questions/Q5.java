package org.example.day18.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {

        // 홀수만 필터링후 합
        int[] arr = {1, 2, 3, 3, 4, 4, 5, 5, 6, 8};
        List<Integer> filteredList = Arrays.stream(arr)
                .filter(n -> n > 3)     // 3보다 큰 숫자 필터링
                .distinct()             // 중복 제거
                .boxed()                // int를 Integer로 변환
                .collect(Collectors.toList());

        //가장 큰 값
        double[] arr2 = {5.0, 3.0, 33.0, 1.0, 35.0};
        double sum = Arrays.stream(arr2)
                .sum();
        System.out.println(sum);


        String[] arr3 = {"정신과","내과","신경과","정형외과"};
        Arrays.stream(arr3)
                .map(word -> word+"사무실")
                .forEach(System.out::println);
    }
}
