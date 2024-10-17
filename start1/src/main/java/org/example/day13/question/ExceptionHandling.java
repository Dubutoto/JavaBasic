package org.example.day13.question;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] names = {"홍길동", "김길동"};
        try {
            System.out.println(names[10]);
        } catch (Exception e) {
            System.out.println("배열 길이 초과");
        }
        int[] ages = null;
        try {
            System.out.println(ages.length);
        } catch (Exception e) {
            System.out.println("null에는 lenghth 사용 불가");
        }
    }
}
