package org.example.day15.제너릭;

import java.util.ArrayList;
import java.util.HashMap;

public class 컬렉션확인 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        String name = list.get(0); //강제캐스팅 불필요
        System.out.println(name);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "엄마");
        String value = map.get(1);
        System.out.println(value);
    }
}
