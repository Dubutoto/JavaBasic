package org.example.day22.stack;

import java.util.HashMap;

public class Q2 {
    public static void main(String[] args) {
        String[] s2 = {"밥", "커피", "밥", "커피", "밥", "밥"};

        // HashMap 생성 및 초기화
        HashMap<String, Integer> map = new HashMap<>();
        map.put("밥", 0);
        map.put("커피", 0);

        // 배열 순회하며 "밥"과 "커피" 횟수 증가
        for (String x : s2) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1); // 기존 값에 1을 더해 횟수 증가
            }
        }

        // 밥과 커피 횟수 가져오기
        int riceCount = map.get("밥");
        int coffeeCount = map.get("커피");

        // 횟수 출력
        System.out.println("밥 횟수: " + riceCount);
        System.out.println("커피 횟수: " + coffeeCount);

        // 더 많이 나온 항목 확인
        if (riceCount > coffeeCount) {
            System.out.println("밥을 더 먹었군요");
        } else if (coffeeCount > riceCount) {
            System.out.println("커피를 더 마셨군요");
        } else {
            System.out.println("밥과 커피를 똑같이 먹었습니다.");
        }
    }
}
