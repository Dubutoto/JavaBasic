package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class WebToonRank {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("WebToonRank");
        frame.setSize(500,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //데이터 준비

        JButton left = new JButton();
        JButton right = new JButton();

        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝 샷", "낫 오버" };
        String []img = {"1.png", "2.png", "3.png", "4.png","5.png"};
        double[] score ={9.9, 8.8, 7.7, 6.6, 5.5};


        //텍스트 3개들어갈 자리(위, 아래, 포스터 이미지)
        JLabel top = new JLabel();
        top.setText("타이틀");

        JLabel under = new JLabel();
        under.setText("평점");

        JLabel center = new JLabel();
        center.setText("이미지 포스터");

        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);

        frame.setVisible(true);
        //Swing 문법 숙련
    }
}
