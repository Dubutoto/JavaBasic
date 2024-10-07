package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WebToonRank {
    static int start = 2; //현재 위치
    //변수가 선언된 위치를 포함한 곳 안에서 사용 가능

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("WebToonRank");
        frame.setSize(440,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel top = new JLabel();
        JLabel under = new JLabel();
        JLabel center = new JLabel();

        String[] title = {"윈드 브레이커", "천재 타자", "펜 홀더", "위닝 샷", "낫 오버" };
        String []img = {"1.png", "2.png", "3.png", "4.png","5.png"};
        double[] score ={9.9, 8.8, 7.7, 6.6, 5.5};


        //데이터 준비
        JButton right = new JButton(">>");
        JButton left = new JButton("<<");

        //오른쪽버튼 구동식
        right.addActionListener(new ActionListener() {
            //addActionListener 는 버튼을 클릭했을때 처리하는 기능을 더함.
            public void actionPerformed(ActionEvent e) {
                //이 ActionPerformed()가 클릭시 자동으로 실행되는 부분.
                if(start<4) {
                    System.out.println("오른쪽 버튼을 눌렸구나");
                    start++;
                    top.setText(title[start]);
                    under.setText(score[start]+"");
                    //정석은 String.valueOf(score[2]);
                    center.setIcon(new ImageIcon(img[start]));
                }else{
                    JOptionPane.showMessageDialog(frame, "마지막 페이지입니다.");
                }
            }
        });

        //왼쪽버튼 구동식
        left.addActionListener(new ActionListener() {
            //addActionListener 는 버튼을 클릭했을때 처리하는 기능을 더함.
            public void actionPerformed(ActionEvent e) {
                //이 ActionPerformed()가 클릭시 자동으로 실행되는 부분.
                if(start>0) {
                System.out.println("왼쪽 버튼을 눌렸구나");
                start--;
                top.setText(title[start]);
                under.setText(score[start]+"");
                //정석은 String.valueOf(score[2]);
                center.setIcon(new ImageIcon(img[start]));
                } else {
                JOptionPane.showMessageDialog(frame, "마지막 페이지입니다.");
                }
        }

        });




        left.setBackground(Color.green);
        left.setForeground(Color.blue);
        right.setBackground(Color.green);
        right.setForeground(Color.blue);



        //텍스트 3개들어갈 자리(위, 아래, 포스터 이미지)


        top.setText(title[2]);
        under.setText(score[2]+"");
        //정석은 String.valueOf(score[2]);
        center.setIcon(new ImageIcon(img[2]));

        Font font = new Font("Arial", Font.BOLD, 25);
        top.setFont(new Font("Arial", Font.BOLD, 35));

        under.setFont(font);
        left.setFont(font);
        right.setFont(font);

        frame.add(top, BorderLayout.NORTH);
        frame.add(under, BorderLayout.SOUTH);
        frame.add(center, BorderLayout.CENTER);
        frame.add(left, BorderLayout.WEST);
        frame.add(right, BorderLayout.EAST);

        frame.setVisible(true);
        //Swing 문법 숙련
    }
}
