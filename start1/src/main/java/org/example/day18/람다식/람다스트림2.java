package org.example.day18.람다식;

import java.util.ArrayList;
import java.util.List;

public class 람다스트림2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
