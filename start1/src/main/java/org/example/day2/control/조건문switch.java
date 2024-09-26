package org.example.day2.control;

public class 조건문switch {
    public static void main(String[] args) {
       int day = 5; //목
                //주말인지 판단
        switch (day) {
            case 1: case 6:
                System.out.println("주말");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("평일");
                break;
        }
    }
}
