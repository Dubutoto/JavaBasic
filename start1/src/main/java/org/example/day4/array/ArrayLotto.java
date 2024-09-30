package org.example.day4.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayLotto {
    public static void main(String[] args) {
        // Set을 사용하여 중복을 자동으로 방지
        Set<Integer> lottoSet = new HashSet<>();
        Random random = new Random();

        // 중복되지 않게 6개의 번호를 추출
        while (lottoSet.size() < 6) {
            lottoSet.add(random.nextInt(45) + 1); // 1 ~ 45 범위의 값 생성
        }

        // Set을 배열로 변환 후 정렬
        Integer[] lotto = lottoSet.toArray(new Integer[0]);
        Arrays.sort(lotto);

        // 결과 출력
        System.out.println("생성된 로또 번호: " + Arrays.toString(lotto));
    }
}

