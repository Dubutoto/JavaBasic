package org.example.review;

import javax.swing.*;

public class Day1 {
    public static void main(String[] args) {
        int month = 10;
        double temp = 20.4;
        final char colour = 'b'; //char 은 한글자 '' 사용
                                 //constant value 에 final 사용. 변수명에 대문자를 넣어 구분(C)
        boolean rain = false;

        System.out.println("Greatest October"); // 프린트후 줄바꿈 명령어
        System.out.println("Month: " + month);

        // 기본형 4가지 : 정수, 실수, 문자1, 논리
        // 정수 : byte(127), short, int, long
        // 실수 : float, double
        float weight = 79.5f;
        double height = 183.4; // double 은 f를 안붙여도 Okay

        String name = JOptionPane.showInputDialog( "What is the name of your favorite person?");
        String age = JOptionPane.showInputDialog("Type your age");

        int age2 = Integer.parseInt(age); // 정수형이 아닌 타입을 정수형으로 변환. 위에서 입력받을때 정수로 입력받아야함

        JOptionPane.showMessageDialog(null, "Your name is "+ name );

        int x = 200;
        int y = 300;

        int sum = x + y;

        double div = y / x;

        double div2 = (double)y /x;
        //cpu 가 값을 가지고 와서 실수로 변경해주어야함 이것을 Casting 이라함.
        System.out.println(div); // 정수형이라 0 이하 자리를 버림
        System.out.println(div2); // 타입캐스팅을 했기에 나옴.

        String a = JOptionPane.showInputDialog("What is the name of your favorite person?");
        String b = JOptionPane.showInputDialog("Type second number");
        //swing 을 이용하여 입력받고 String형 a 변수에 저장
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        // 문자열 a 변수 를 정수형 a2 변수로 변환

        float div3 = (float)(a2 + b2 )/2f;
        //타입캐스팅으로 형변환 하며 연산후 실수형 변수 div3 에 저장
        System.out.println(div3);
        JOptionPane.showMessageDialog(null,div3);

    }
}
