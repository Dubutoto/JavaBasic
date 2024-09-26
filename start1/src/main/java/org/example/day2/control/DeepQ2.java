package org.example.day2.control;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeepQ2 {
    public static void main(String[] args) {

        JFrame f = new JFrame();    // Initialise large window
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        JLabel l1 = new JLabel();
        Font font = new Font("SansSerif", Font.BOLD, 20);
        l1.setText("Want to continue?");
        l1.setFont(font);
        l1.setHorizontalAlignment(SwingConstants.CENTER);

        f.setTitle("Number Game");
        b1.setText("Continue");
        b2.setText("Exit");

        f.setSize(300,300);


        f.setLayout(new GridLayout(4, 1));

        f.add(l1);
        f.add(b1);
        f.add(b2);

        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                JFrame newF = new JFrame();
                newF.setSize(300, 200);
                newF.setTitle("Input");

                // 새로운 버튼 생성

                JLabel l1 = new JLabel();
                l1.setText("첫번째 사람이 숫자를 입력하세요");
                l1.setFont(font);
                JButton n1 = new JButton("Cancel");
                JButton n2 = new JButton("OK");

                // 새로운 창에 버튼 추가
                n1.setBounds(180,-40,60,30);
                n2.setBounds(260,-40,60,30);
                newF.add(l1);
                newF.add(n1);
                newF.add(n2);

                // 창 닫기 설정 및 표시
                // newF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 창만 닫고 프로그램은 종료하지 않음
                newF.setVisible(true);

            }
        });


        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // 프로그램 종료
                System.exit(0);
            }
        });

        f.setVisible(true); //마지막에
    }
}
