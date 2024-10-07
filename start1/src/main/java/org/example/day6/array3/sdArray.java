package org.example.day6.array3;

public class sdArray {
    public static void main(String[] args) {
        // 가로(행, row), 세로(열, column)
        // {    0  1  2
        // 0:  {0, 0, 0,},
        // 1:  {0, 0, 0,}

        // }
        int[][] seat = new int[2][3]; //행, 열의 개수
        seat[0][0] = 100;
        seat[0][2] = 200;
        seat[1][1] = 300;
        seat[1][2] = 400;

        System.out.println(seat[1][0]);
        System.out.println(seat.length);
        // 2차원 배열에서 배열명.length = 행의 개수
        System.out.println(seat[0].length); // 0행의 열의 개수
        System.out.println(seat[1].length); // 1행의 열의 개수

        for (int i = 0; i < seat.length; i++) { //행의 index
            for (int j = 0; j < seat[i].length; j++) { //열의 index
                System.out.print(seat[i][j] + " ");
                //반복 Structure 구상.

            } //한행의 끝
            System.out.println(); //줄넘김(위치 중요)
        }
    }
}
