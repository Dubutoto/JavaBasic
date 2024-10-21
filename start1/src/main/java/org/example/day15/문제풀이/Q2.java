package org.example.day15.문제풀이;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100, "김데이");
        map.put(200, "김사전");
        map.put(300, "김뚱성");
        map.put(400, "김자료");

        map.remove(200); //탈퇴
        map.replace(300, "김충성");
        System.out.println(map.values());
    }
}
