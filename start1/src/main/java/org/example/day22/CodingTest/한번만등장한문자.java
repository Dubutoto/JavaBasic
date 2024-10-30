package org.example.day22.CodingTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {
    public static void main(String[] args) {
        String s = "abcabcdee";
        //1. 목록에 어떤 문자가 있는지 일단 찾아야한다
        //2. 그 문자가 몇번이나 나왔는지 찾아야한다.
        HashSet<String> set = new HashSet<>(); // 중복을 제거하기 위함
        String[] s2 = s.split("");
        for(String x:s2){
            set.add(x);
        };
        System.out.println(set);

        List<String> list = new ArrayList<>();


    }
}
