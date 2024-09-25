package org.example.day1.oper;

import javax.swing.*;

public class Oper3
    {
        public static void main(String[] args)
        {
            //정수 1 입력 --> a 라는 변수에 저장, 333
            //정수 2 입력 --> b 라는 변수에 저장, 222

            //입력 받은 데이터를 int 로 각각 변환하여 a2, b2 로 저장
            //두 입력값의 평균을 구하시오.(실수로)
            String a = JOptionPane.showInputDialog("Type first number");
            String b = JOptionPane.showInputDialog("Type second number");

            int a2 = Integer.parseInt(a);
            int b2 = Integer.parseInt(b);

            float div = (float)(a2 + b2 )/2f;
            System.out.println(div);
            JOptionPane.showMessageDialog(null,div);


        }
    }
