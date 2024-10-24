package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림6 {
    public static void main(String[] args) {
        //숫자 리스트에서 홀수 숫자의 제곱을 구하여 출력하기
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        //스트림에 넣어
        numbers.stream()
                //홀수만 필터링, filter(조건) ==>  결과는 조건에 맞는 것만 Stream에 남음.
                .filter(x -> x % 2 != 0)
                //필터링한 데이터들에 제곱을 구해서, map(스트림전체 데이터 하나씩 처리) ==> 결과는 처리한 결과가 들어있는 스트림
                .map(x -> x * x)
                //출력
                .forEach(System.out::println);

    }
}