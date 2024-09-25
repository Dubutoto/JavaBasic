package org.example.basic;

import javax.swing.*;

public class Q3
    {
        public static void  main(String[] args)
        {
            String a = JOptionPane.showInputDialog("Type first Mathematics score");
            String b = JOptionPane.showInputDialog("Type second Mathematics score");

            String x = JOptionPane.showInputDialog("Type first English score");
            String y = JOptionPane.showInputDialog("Type second English score");

            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            int x1 = Integer.parseInt(x);
            int y1 = Integer.parseInt(y);

            float mDiv = (float)(a1 + b1 )/2f;
            float eDiv = (float)(x1 + y1 )/2f;
            JOptionPane.showMessageDialog(null,"Average Mathematics score: " + mDiv + "\n"+"Average English score: " + eDiv);
        }
    }
