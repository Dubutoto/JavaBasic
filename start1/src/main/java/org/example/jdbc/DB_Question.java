package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DB_Question {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("드라이버 설정 성공");

        String url = "jdbc:mysql://127.0.0.1:3306/shop2";
        String username = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("DB 연결 성공");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 삽입, 2: 삭제, 3: 수정 중 선택하세요.");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            // 삽입
            System.out.printf("DeptNo >> ");
            String dept = scanner.nextLine();
            System.out.printf("DeptName >> ");
            String name = scanner.nextLine();
            System.out.printf("Location >> ");
            String loc = scanner.nextLine();

            String sql = "insert into dept2 values (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dept);
            ps.setString(2, name);
            ps.setString(3, loc);

            int result = ps.executeUpdate();
            System.out.println("삽입 완료, 처리된 row 수: " + result);
            ps.close();

        } else if (choice == 2) {
            // 삭제
            System.out.printf("삭제할 DeptNo >> ");
            String deptNoToDelete = scanner.nextLine();

            String sql2 = "delete from dept2 where deptno = ?";
            PreparedStatement ps = con.prepareStatement(sql2);
            ps.setString(1, deptNoToDelete);

            int result = ps.executeUpdate();
            System.out.println("삭제 완료, 처리된 row 수: " + result);
            ps.close();

        } else if (choice == 3) {
            // 수정
            System.out.printf("변경할 DeptNo >> ");
            String targetDeptNo = scanner.nextLine();
            System.out.printf("새로운 DeptNo >> ");
            String newDeptNo = scanner.nextLine();
            System.out.printf("새로운 Location >> ");
            String newLoc = scanner.nextLine();

            String sql3 = "update dept2 set DeptNo = ?, Location = ? where DeptNo = ?";
            PreparedStatement ps = con.prepareStatement(sql3);
            ps.setString(1, newDeptNo);
            ps.setString(2, newLoc);
            ps.setString(3, targetDeptNo);

            int result = ps.executeUpdate();
            System.out.println("수정 완료, 처리된 row 수: " + result);
            ps.close();
        } else {
            System.out.println("잘못된 선택입니다.");
        }

        // 연결 자원 닫기
        con.close();
        scanner.close();
    }
}



