package org.example.jdbc4.연습;

import java.sql.*;
import java.util.ArrayList;

public class DeptDAO2 {
    Connection con;

    //jdbc 4단계
    public DeptDAO2() throws Exception {
    //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
    //2. db연결
        String url = "jdbc:mysql://localhost:3306/mydb";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    public DeptVO2 one(int deptno) throws SQLException {
        //검색결과가 row개 ----가방(vo)에 컬럼값 다 넣어서 전달---> ui
        DeptVO2 bag = new DeptVO2();

        //3단계
        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);

        //4단계
        //테이블 형태로 검색결과가 와야하므로, executeQuery()
        ResultSet table = ps.executeQuery(); //컬럼+값들(row)
        if(table.next()){ //true
            //있으면 row에 있는 값들을 꺼내어 vo에 넣자.
            //ORM
            bag.setDeptno(table.getInt("deptno"));//1
            bag.setDname(table.getString(2));
            bag.setLoc(table.getString("loc")); //컬럼명
            //db의 인덱스는 1부터 시작
        }
        return bag;
    }

    public ArrayList<DeptVO2> list() throws SQLException {
        //row하나당 가방(vo) 하나 필요함.
        //row 5개이면 가방(vo) 5개 필요함.
        //ui에 가방 5개 리턴해서 전달하려면 묶어주어야함.
        //--> 자바에서는 리턴할 때 무조건!! 하나로 묶어서 해야함.
        //가방을 묶어줄 용도로 사용하는 것이 List타입의 객체(ArrayList)를 사용함.
        ArrayList<DeptVO2> list = new ArrayList<>();

        //3단계
        String sql = "select * from dept";
        PreparedStatement ps = con.prepareStatement(sql);

        //4단계
        //테이블 형태로 검색결과가 와야하므로, executeQuery()
        ResultSet table = ps.executeQuery(); //컬럼+값들(row)
        while(table.next()){ //없다고 할때까지(false)반복!
            //있으면 row에 있는 값들을 꺼내어 vo에 넣자.
            //ORM
            DeptVO2 bag = new DeptVO2();
            bag.setDeptno(table.getInt("deptno"));//1
            bag.setDname(table.getString(2));
            bag.setLoc(table.getString("loc")); //컬럼명
            //db의 인덱스는 1부터 시작
            list.add(bag);
        }
        return list;
    }
}