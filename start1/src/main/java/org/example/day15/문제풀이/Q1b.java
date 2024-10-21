package org.example.day15.문제풀이;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1b {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("국어", "수학", "영어", "컴퓨터"));
        System.out.println(list.size());
        int x = list.size(); // init size
        for(int i= 0; i < x-1; i++){
            System.out.println(i);
            list.remove(0);
            System.out.println(i+1+"회차 시험을 한날은 과목"+list);
        }
    }
}
