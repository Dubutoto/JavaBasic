package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;

public class 람다스트림5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        words.stream().map(x -> x.substring(0, 1))
                .forEach(System.out::print);

    }
}