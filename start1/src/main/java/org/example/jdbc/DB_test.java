package org.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB_test {
    public static void main(String[] args) throws Exception {
        // 자바에서 db 를 연결하는 프로그램 4단계
        // Java DB Connectivity(JDBC) 4단계
        // 1단계 - 사용할 라이브러리 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1단계 드라이버 설정 성공!");
        // 2단계 - db연결 --> 데이터! (실무 설정)
        String url = "jdbc:mysql://localhost:3306/shop2"; //ip+port+db명
        String id = "root";
        String pwd = "";

        Connection con = DriverManager.getConnection(url, id, pwd);
        System.out.println("2단계 연결 성공!");

        // 3단계 - SQL문을 만든다.
        String sql = "insert into shop2 values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        //ps.setString(1, id);
        //ps.setString(2, pwd);
        // ps.setString(3, name);
        // ps.setString(4, tel);
        // 4단계 - dbms로 sql문 전송
        ps.executeUpdate();
    }
}
