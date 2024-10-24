package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림3 {
    public static void main(String[] args) {
        //배열에 있는 데이터를 바로 List에 넣을 수 있음.
        List<String> words = Arrays.asList("hi", "hello", "sun", "sky", "sea");

        words.stream().filter(x -> x.length() >= 3)
                .forEach(System.out::println);
    }
}
