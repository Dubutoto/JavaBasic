package org.example.day4.review;

public class MakeArray {
    public static void main(String[] args) {
        // 1.Known values
        int[] days = {1, 3, 4, 5, 6};
        // 2.Unknown values
        String[] doing = new String[5]; // Auto initialising {null, null, ...}
        doing[0] = "resting";           // String -> "" Char -> ''
        doing[1] = "sleeping";
        double[] temp = {22, 20, 15, 17, 19};

        System.out.println(days);
        System.out.println(doing);
        System.out.println(temp);

        for (int i = 0; i < 5; i++) {
            System.out.println(days[i] + " 일에" + doing[i] + " 하기. 온도는 " + temp[i]);
        }
        for (double t : temp){
           System.out.println(t);
           //temp 라는 배열을 앞에서 부터 순서대로 있는지 체크해서 하나씩 꺼내어
           //t라는 변수에 넣어주는 for문
        }                 // for-each
    }
}
