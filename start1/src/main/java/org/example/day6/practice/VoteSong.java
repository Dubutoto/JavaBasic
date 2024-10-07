package org.example.day6.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteSong {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(450, 450);
        Font font = new Font("궁서", Font.BOLD, 20);

        // GridLayout 사용 (5행 1열)
        frame.setLayout(new GridLayout(5, 1, 10, 10)); // 5행 1열, 컴포넌트 간 10px 간격

        JLabel aLabel = new JLabel("Select your favorite song", SwingConstants.CENTER); // 중앙 정렬
        JButton a = new JButton("아이유 - LILAC");
        JButton b = new JButton("프로미스나인 - We GO");
        JButton c = new JButton("스테이씨 - ASAP");
        JButton d = new JButton("종료");

        JButton[] buttons = {a, b, c, d};

        // 버튼별로 메시지 창 띄우기
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You voted for 아이유 - LILAC.");
            }
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You voted for 프로미스나인 - We GO.");
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You voted for 스테이씨 - ASAP.");
            }
        });

        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "투표를 종료합니다.");
                System.exit(0); // 프로그램 종료
            }
        });
        // 폰트 설정
        aLabel.setFont(font);
        frame.add(aLabel);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setFont(font);
            frame.add(buttons[i]);
        }

        frame.setTitle("Popular Song Voting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}