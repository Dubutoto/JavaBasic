package org.example.day12.debugger;

public class DebuggingEx2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b); //값을 전달!
        System.out.println(result);



        System.out.println("여기까지 실행해줘.");
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
