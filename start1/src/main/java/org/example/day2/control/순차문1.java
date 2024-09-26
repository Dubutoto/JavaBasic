
package org.example.day2.control;

import javax.swing.*;

public class 순차문1 { //Sequential steps1
    public static void main(String[] args) {
        String id ="root";
        String pw ="1234"; //account database

        //Input
        String id2 = null; // 기본형이 아닌 자료형 초기화에 사용
        String pw2 = null;
        id2 = JOptionPane.showInputDialog("Input your ID"); // "admin" or "root"
        pw2 = JOptionPane.showInputDialog("Input your PW"); // "1111" or "1234"

        System.out.println(id.equals(id2) && pw.equals(pw2));
    }
}
