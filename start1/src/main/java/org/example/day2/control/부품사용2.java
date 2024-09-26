package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
       //JFrame 만들고
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setTitle("부품사용연습");

        //버튼 만들기
        JButton button = new JButton();
        button.setText("button");
        button.setBackground(Color.BLUE);
        button.setOpaque(true);            //맥에서의 해결법 찾아보기
        // button.setBorderPainted(false);
        f.add(button);


        f.setVisible(true);
    }
}
