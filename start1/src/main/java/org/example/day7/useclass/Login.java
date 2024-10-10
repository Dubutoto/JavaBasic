package org.example.day7.useclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);

        //JLabel 3개, JTextField 2개, JButton 2개
        JLabel top = new JLabel();
        top.setText("일기장");
        Font font = new Font("Arial", Font.BOLD, 105);
        top.setFont(font);
        JLabel id = new JLabel();
        id.setText("  ID");
        JLabel pw = new JLabel();
        pw.setText("PASSWORD");
        JButton login = new JButton("Login");
        JButton cancel = new JButton("Cancel");

        ImageIcon icon = new ImageIcon("ok.png");
        ImageIcon icon2 = new ImageIcon("del.png");

        JTextField id2 = new JTextField(16);
        JTextField pw2 = new JTextField(16);
        login.setIcon(icon);
        cancel.setIcon(icon2);


        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);
        frame.add(top);
        frame.add(id);
        frame.add(id2);
        frame.add(pw);
        frame.add(pw2);
        frame.add(login);
        frame.add(cancel);

        //ok 버튼 - 아이디와 패스워드가 root, 1234가 맞는지 체크
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inputID = id2.getText();
                String inputPW = pw2.getText();

                // x == y 는 주소가 같은지 확인. 값비교가 아님
                if (inputID.equals("") || inputPW.equals("")) {
                   // JOptionPane.showMessageDialog(frame, "Input your full ID and PW");
                    frame.setTitle("Input your full ID and PW");
                }else{
                        if (inputID.equals("root") && inputPW.equals("1234")) {
                             JOptionPane.showMessageDialog(frame, "Login Success");
                            //frame.setTitle("Login Success");
                            DiaryWriting dw = new DiaryWriting(); //메서드 선언
                            dw.diaryWritingUI(); //메서드 내부 기능실행
                        } else {
                            // JOptionPane.showMessageDialog(frame, "Invalid ID or Password");
                            frame.setTitle("Invalid ID or Password");
                        }
                    }
                }
        });

        //del버튼 - 입력한값 지우기 처리
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                id2.setText("");
                pw2.setText("");
            }
        });
        //맨끝
        //하
        frame.setVisible(true);
    }
}
