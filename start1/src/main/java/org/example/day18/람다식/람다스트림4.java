package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림4 {
    public static void main(String[] args) {
        //배열에 있는 데이터를 바로 List에 넣을 수 있음.
        List<Integer> words = Arrays.asList(-3,5,-1,7,-8,2);

        words.stream().filter(x -> x < 0)
                .forEach(System.out::println);
    }
}
