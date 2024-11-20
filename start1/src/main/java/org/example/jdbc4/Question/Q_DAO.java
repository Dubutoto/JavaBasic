package org.example.jdbc4.Question;

import java.sql.*;
import java.util.ArrayList;

public class Q_DAO {
    Connection con;

    public Q_DAO() throws ClassNotFoundException, SQLException {
        // 1. 드라이버 설정
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");

        // 2. DB 연결
        String url = "jdbc:mysql://localhost:3306/mydb";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. DB 연결 성공!");
    }

    // 특정 ID로 단일 조회
    public Q_VO one(int productID) throws SQLException {
        Q_VO bag = new Q_VO();
        String sql = "select * from products where productID = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, productID);

        ResultSet table = ps.executeQuery();
        if(table.next()){
            bag.setProductID(table.getInt("productID"));
            bag.setProductName(table.getString("productName"));
            bag.setPrice(table.getDouble("price"));
            bag.setQuantity(table.getInt("quantity"));
        } else {
            throw new SQLException("검색 결과가 없습니다.");
        }
        return bag;
    }

    // 전체 목록 조회 메서드
    public ArrayList<Q_VO> list() throws SQLException {
        String sql = "select * from product";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet table = ps.executeQuery();

        // 데이터가 있는 경우에만 리스트 생성
        if (!table.next()) {
            return null; // 데이터가 없으면 null 반환
        }

        ArrayList<Q_VO> list = new ArrayList<>();
        do {
            Q_VO bag = new Q_VO();
            bag.setProductID(table.getInt("productID"));
            bag.setProductName(table.getString("productName"));
            bag.setPrice(table.getDouble("price"));
            bag.setQuantity(table.getInt("quantity"));
            list.add(bag);
        } while (table.next());

        return list;
    }
}
