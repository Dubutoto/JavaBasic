package org.example.day18.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("파인애플","송아지","양","스마일","소");
        List<String> oneString = strings.stream()
                .filter(word -> word.length() ==1 )
                .collect(Collectors.toList());
                System.out.println(oneString);

        List<String> images = Arrays.asList("1.png","2.png","3.jpeg,","4.jpeg");
        List<String> image = images.stream()
                .filter(word -> word.endsWith(".jpeg"))
                .collect(Collectors.toList());
                System.out.println(image);
    }
}
