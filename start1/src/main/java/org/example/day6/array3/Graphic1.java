package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class Graphic1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Graphic Practice");

        JButton button = new JButton();
        button.setText("Click Me!"); //함수, 메서드, 명령어는 명령어(입력 데이터);


        JButton button2 = new JButton();
        button2.setText("OH!"); //함수, 메서드, 명령어는 명령어(입력 데이터);


        //JFrame 은 왼쪽,윗쪽,가운데,오른쩌쪾
        // ,아랫쪽중애서 선택
        //위치를 정하지 않으면 중간이 default
        frame.add(button, BorderLayout.NORTH);
        frame.add(button2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //x를 누르면 프로그램 종료
        frame.setVisible(true); // 마지막
    }
}
