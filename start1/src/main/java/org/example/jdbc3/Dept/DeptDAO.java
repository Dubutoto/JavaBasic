package org.example.jdbc3.Dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DeptDAO {
    Connection con;//전역변수가 됨, null로 초기화!

    public DeptDAO() throws Exception {
        //new DeptDAO()할 때 클래스이름과 동일한 메서드인 생성자메서드가
        //                     자동호출됨.(1-2단계를 실행해줌)
        //1. 드라이버 설정 --> 레이지로딩(실행시에 메모리에 올려줌)
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        //2. db연결
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id, pw);
        System.out.println("2. db연결 성공!");
    }

    //기능은 메서드로 정의
    //row하나 검색 --> 워크벤치에서  sql문으로 먼저 테스트
    public DeptVO one(int deptno) throws Exception {

        //1,2 단계는 DAO객체생성시 벌써 실행됨.
        //3,4 단계만 구현하면됨.
        //3. sql문 객체로 준비
        //4. 준비된 sql문 mysql로 전송
        String sql = "select * from dept where id  = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);
        ResultSet table  = ps.executeQuery(); //테이블 형태로 mysql로 부터 받아와야할 때 사용
        //결과가 있으면 컬럼의 이름이나 순서로 값을 꺼낼 수 있음.
        //System.out.println(table.next()); //true, false
        //table에 있는 데이터를 꺼내서 vo에 넣어 ui에 주어야함.!
        //ResultSet은 DAO안에서만 쓰는 객체(부품이므로) dao밖에서는 쓰지 않음.
        //다른 클래스로 ResultSet에 들어있는 데이터를 전달하고자 하는 경우는
        //꺼내어 vo(DTO)에 넣어서 전달해야함.
        //코드의 일관성 문제!
//        받는 쪽 UI(각각 다 다르게 코드해야함. 받는 타입에 따라 코드 수정 필요)
//          <-ResultSet--- db에서 가지고 올 때 ResultSet에 결과가 들어있음.
//          <-XML--- 영화진흥청에서 가지고 올 때 xml에 결과가 들어있음.
//          <-JSON--- 영화종합정보사에서 가지고 올 때 json에 결과가 들어있음.
//
//        받는 쪽 UI(vo에서 꺼내는 코드만 하면 됨. 코드 수정 불필요)
//          <-vo--- db에서 가지고 올 때 ResultSet에 결과가 들어있음.
//          <-vo--- 영화진흥청에서 가지고 올 때 xml에 결과가 들어있음.
//          <-vo--- 영화종합정보사에서 가지고 올 때 json에 결과가 들어있음.

        //UI로 ResultSet에 있는 것 있으면 꺼내서 vo에 넣어서 전달하자!
        DeptVO vo = new DeptVO();
        if(table.next()){
            vo.setDeptNo(table.getInt("id")); //컬럼명 선호!
            vo.setDname(table.getString(2)); //인덱스 사용 가능!
            vo.setLoc(table.getString("name"));

        }
        return vo;
    }
}
