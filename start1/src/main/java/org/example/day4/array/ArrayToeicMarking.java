package org.example.day4.array;

import java.util.Random;

public class ArrayToeicMarking {
    public static void main(String[] args) {
    // 1.답안 배열, 내답 배열, 랜덤 초기화
        int answer[] = new int[990];
        int mark[] = new int[990]   ;
        Random random = new Random();
    // 2.Random 이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요.
        for(int i = 0; i < 990; i++) {
            answer[i] = random.nextInt(4 + 1);
            mark[i] = random.nextInt(4) + 1;
        }
    // 3.답안과 내답의 인덱스값을 각각 비교해서 맞으면 1점!
        int score = 0;
        for (int i = 0; i < 990; i++) {
            if(answer[i] == mark[i]) {
                score++;
            }
        }
    // 4.총점을 출력
        System.out.println("Your TOEIC score is: "+ score);
    }
}
