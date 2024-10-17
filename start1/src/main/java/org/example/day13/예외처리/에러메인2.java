package org.example.day13.예외처리;

public class 에러메인2 {
    public static void main(String[] args) {
        배열에러2 ar2 = new 배열에러2();
        try {
            ar2.array();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

