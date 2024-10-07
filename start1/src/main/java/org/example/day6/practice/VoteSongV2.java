package org.example.day6.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoteSongV2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(450, 450);
        Font font = new Font("궁서", Font.BOLD, 20);

        // GridLayout 사용 (5행 1열)
        frame.setLayout(new GridLayout(5, 1, 10, 10)); // 5행 1열, 컴포넌트 간 10px 간격

        JLabel aLabel = new JLabel("Select your favorite song", SwingConstants.CENTER); // 중앙 정렬
        frame.add(aLabel);
        // 버튼과 메시지를 배열로 정의
        String[] buttonLabels = {"아이유 - LILAC", "프로미스나인 - We GO", "스테이씨 - ASAP", "종료"};
        String[] messages = {
                "아이유 - LILAC을 선택했습니다.",
                "프로미스나인 - We GO를 선택했습니다.",
                "스테이씨 - ASAP을 선택했습니다.",
                "투표를 종료합니다."
        };

        JButton[] buttons = new JButton[buttonLabels.length];

        // 폰트 설정 및 버튼 생성
        aLabel.setFont(font);
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(font);
            frame.add(buttons[i]);

            // 각 버튼에 공통 ActionListener 추가
            final int index = i; // 인덱스를 final로 만들어서 ActionListener에서 접근 가능하도록 함
            buttons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (index == buttonLabels.length - 1) {
                        // 종료 버튼 클릭 시
                        JOptionPane.showMessageDialog(frame, messages[index]);
                        System.exit(0);
                    } else {
                        // 나머지 버튼 클릭 시
                        JOptionPane.showMessageDialog(frame, messages[index]);
                    }
                }
            });
        }

        frame.setTitle("Popular Song Voting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
