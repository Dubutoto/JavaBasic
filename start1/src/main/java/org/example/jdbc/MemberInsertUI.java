package org.example.jdbc;

import java.util.Scanner;

public class MemberInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id입력>> ");
        String id값 = sc.next(); //apple
        System.out.print("pw입력>> ");
        String pw값 = sc.next(); //1234
        System.out.print("name입력>> ");
        String name값 = sc.next(); //apple
        System.out.print("tel입력>> ");
        String tel값 = sc.next(); //1111
        sc.close();

        org.example.jdbc2.MemberDAO2 dao = new org.example.jdbc2.MemberDAO2();
        // dao.insert(id값,pw값,name값,tel값);
        // dao.delete(id값);

    }
}
