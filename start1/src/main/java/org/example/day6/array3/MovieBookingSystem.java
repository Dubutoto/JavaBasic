package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MovieBookingSystem {
    static int count = 0;
    static ArrayList<String> bookedSeats = new ArrayList<>();  // 예매된 좌석 번호 리스트

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(560,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow); //add()한 순서대로 물흐르듯이 뒤에다 붙여줌.!

        for(int i=0; i<100; i++){
            JButton button = new JButton();
            button.setText(i+"");
            frame.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //버튼 클릭했을때 실행되는 내용
                    //버튼 클릭하면 ActionListener 안에 있는 actionPerformed()라는
                    //함수가 자동 실행!

                        String seatNumber = e.getActionCommand(); //버튼 위에 있는 글자를 가지고 온다.
                        JOptionPane.showMessageDialog(frame, seatNumber + " 번 예매되었습니다.");
                        count++;
                        bookedSeats.add(seatNumber);  // 예매된 좌석 번호 저장
                        button.setEnabled(false);  //중복 예매방지  //중복 예매방지  //중복 예매방지
                        button.setBackground(Color.RED);
                }
            });
        }

        JButton pButton = new JButton();
        pButton.setText("결제하기");
        pButton.setBackground(Color.YELLOW);
        pButton.setOpaque(true);
        frame.add(pButton);

        pButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int totalCost = count * 10000;
                //정석은 String.valueOf(score[2]);
                JOptionPane.showMessageDialog(frame, "예매한 자리 번호: "+bookedSeats+"\n전체결제 금액은: "+ totalCost + "원 입니다");
            }
        });
        


        frame.setVisible(true);
    }
}
