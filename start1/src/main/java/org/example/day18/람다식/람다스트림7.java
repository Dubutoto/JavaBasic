package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 람다스트림7 {
    public static void main(String[] args) {
        // 중복을 제거하여 프린트
        List<String> numbers = Arrays.asList("사과", "바나나", "포도", "바나나", "멜론");
        List<String> uniqueNumbers = numbers.stream()
                .distinct()   // 중복 제거
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        // 필터링하여 목록을 생성 후 출력하시오
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 5)  // 글자 수 5 이상인 단어 필터링
                .collect(Collectors.toList());
        System.out.println(filteredWords);
    }
}
