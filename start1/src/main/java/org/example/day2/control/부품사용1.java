
package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

//Swing practice

public class 부품사용1 { //
    public static void main(String[] args) {
        JFrame f = new JFrame();    // Initialise large window
        JButton b1 = new JButton();
        JButton b2 = new JButton();

        f.setSize(300,300);

        b1.setText("Click Me Plz");
        b2.setText("Click Me as Well");
        b1.setBackground(Color.RED);
        b2.setBackground(Color.RED);
        b1.setForeground(Color.BLUE);
        b2.setForeground(Color.BLUE);

        Font font = new Font("궁서",Font.BOLD,20);
        b1.setFont(font);
        b2.setFont(font);
        //allocation component
        //물흐르는 것처럼 순서대로 다붙여주는 레이아웃
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(b1);
        f.add(b2);

        f.setVisible(true); // 항상 맨끝에 위치시켜야함 이줄 아랫줄은 안보여짐.
    }
}
