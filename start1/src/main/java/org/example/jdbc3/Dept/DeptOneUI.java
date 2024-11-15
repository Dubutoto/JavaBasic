package org.example.jdbc3.Dept;

import javax.swing.*;
import java.util.Scanner;

public class DeptOneUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 deptNo입력>> ");
        String deptNo = sc.next();

        DeptDAO dao = new DeptDAO();
        DeptVO bag = dao.one(Integer.parseInt(deptNo)); //MemberVO가 리턴
        //가방 받은 쪽에서 변수 bag만들어서 저장, 하나씩 꺼내어 처리!
        String total = bag.getDeptNo() + " " + bag.getDname() + " " + bag.getLoc();
        JOptionPane.showMessageDialog(null, total);
        sc.close();
    }
}
