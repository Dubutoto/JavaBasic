package org.example.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeptDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/shop2";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public void insert(DeptVO vo) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            // MySQL JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 데이터베이스 연결
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            // SQL 쿼리 작성
            String sql = "INSERT INTO dept (deptno, dname, loc) VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, vo.getDeptno());
            ps.setString(2, vo.getDname());
            ps.setString(3, vo.getLoc());

            // 쿼리 실행
            ps.executeUpdate();
            System.out.println("Data inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 자원 해제
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
