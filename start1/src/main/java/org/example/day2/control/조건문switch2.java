package org.example.day2.control;

public class 조건문switch2 {
    public static void main(String[] args) {

        int month = 9;
        //계절 판별
        switch (month) {
            case 1: case 12: case 2:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
        }

        String food = "짬뽕";
        switch (food) {
            case "짬뽕":
                System.out.println("중국집으로");
            case "우동":
                System.out.println("분식집으로");
            case "감자탕":
                System.out.println("한식집으로");
            default:
                System.out.println("집에서 먹자");
        }

    }
}
