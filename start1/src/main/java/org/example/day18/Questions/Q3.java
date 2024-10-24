package org.example.day18.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello","Hi","smile");
        List<String> uniqueWords = words.stream()
                .map(word -> word.toUpperCase())
                .filter(word -> word.length() > 4)
                .collect(Collectors.toList());

        List<String> addedWords = words.stream()
                .map(word -> word + "님")
                .collect(Collectors.toList());
        System.out.println(addedWords);
    }
}

