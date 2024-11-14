package org.example.jdbc2;

import java.util.Scanner;

public class DeptInsertUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        System.out.print("DEPTNO: ");
        String deptno = scanner.nextLine();

        System.out.print("DNAME: ");
        String dname = scanner.nextLine();

        System.out.print("LOC: ");
        String loc = scanner.nextLine();

        // DeptVO 객체 생성 및 데이터 설정
        DeptVO vo = new DeptVO();
        vo.setDeptno(deptno);
        vo.setDname(dname);
        vo.setLoc(loc);

        // DeptDAO 객체를 이용해 데이터 삽입
        DeptDAO dao = new DeptDAO();
        dao.insert(vo);

        scanner.close();
    }
}

