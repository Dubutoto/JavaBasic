package org.example.day18.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> sortedNumbers = numbers.stream()
                .filter(number -> number > 3)
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        //각 요소에 대해 10을 곱한 후 list 를 생성해 출력 - 스트림과 람다 활용

        List<Integer> multipliedNumbers = numbers.stream()
                .map(number -> number * 10) // 각 요소에 10을 곱함
                .collect(Collectors.toList());
        System.out.println("10을 곱한 리스트: " + multipliedNumbers);
    }
}

