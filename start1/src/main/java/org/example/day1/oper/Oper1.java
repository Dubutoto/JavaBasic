
package org.example.day1.oper;

import javax.swing.*;

public class Oper1
    {
        public static void main(String[] args)
        {
            String name = JOptionPane.showInputDialog("Type your name");
            String age = JOptionPane.showInputDialog("Type your age");
            // String job = JOptionPane.showInputDialog("Type your job");

            int age2 = Integer.parseInt(age);

            System.out.println(name + "," + age2);
            //age2 에 1을 더해서 age3에 넣었다가 프린트
            int age3 = age2 + 1;
            System.out.println(name + "," + age3);
            JOptionPane.showMessageDialog(null, "Your name is "+ name +" and age is "+ age3);

        }
    }
