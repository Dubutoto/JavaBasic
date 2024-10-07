package org.example.day6.array3;

public class sdArray2 {
    public static void main(String[] args) {
        //배열을 만들때 처음에 값을 모르고 있는 경우
        int[][] n2 = new int[3][];
        System.out.println(n2.length);
        //총 메모리(참조형 4바이트)
        //n2, n2[0], n2[1], n2[2] ==> 16
        //length ==> 4
        System.out.println(n2[0]);
        System.out.println(n2);

        //1차원 배열 3개 생성
        int[] r0 = new int[10];
        int[] r1 = new int[15];
        int[] r2 = new int[12];
        System.out.println(r0);
        n2[0] = r0;
        n2[1] = r1;
        n2[2] = r2;
        System.out.println(n2[0].length);

        for (int i = 0; i < n2.length; i++) {
            for (int j = 0; j < n2[i].length; j++) {
                System.out.print(n2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
