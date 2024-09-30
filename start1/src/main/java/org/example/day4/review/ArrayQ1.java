package org.example.day4.review;

public class ArrayQ1 {
    public static void main(String[] args) {
        // 1. 여행가고 싶은 지역 3개를 배열에 넣기 (Known values)
        String[] location = {"Santorini", "London", "Bath"};
        // 2. 비용 (Known)
        int[] cost = {240, 340, 200};
        // 3. 함께 가고 싶은 사람 이름 (Unknown)
        String[] co = new String[3];

        co[0] = "친구";
        // co[2] = "동생";

        // 가로세로 일치 출력
        System.out.printf("%-15s %-10s %-10s\n", "Location", "Cost", "Companion"); // header
        System.out.println("---------------------------------------");

        for (int i = 0; i < location.length; i++) { //int i 변수 역할: 반복횟수체크용, 배열의 인덱스용, 계산대상 데이터용
            // format으로 열의 너비를 고정: %-15s는 15칸의 문자열, %-10s는 10칸의 문자열, %-10d는 10칸의 정수
            System.out.printf("%-15s %-10d %-10s\n", location[i], cost[i], co[i]);
        }
    }
}









