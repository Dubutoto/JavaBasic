package org.example.jdbc;

import java.util.Scanner;

public class MemberUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("id입력>> ");
        String id값 = sc.next(); //ice
        System.out.print("tel입력>> ");
        String tel값 = sc.next(); //9999
        sc.close();

        //Member테이블에 연결해서 입력받은 데이터를 주고 update해달라고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 update()호출!
        org.example.jdbc2.MemberDAO2 dao = new org.example.jdbc2.MemberDAO2();
        dao.update(id값, tel값);
    }
}