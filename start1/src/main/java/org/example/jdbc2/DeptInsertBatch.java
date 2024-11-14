package org.example.jdbc2;

public class DeptInsertBatch {
    public static void main(String[] args) {
        DeptDAO dao = new DeptDAO();

        for (int i = 1; i <= 200000; i++) {
            // 더미 데이터 생성
            DeptVO vo = new DeptVO();
            vo.setDeptno(String.valueOf(i));       // 부서 번호
            vo.setDname("Department_" + i);        // 부서 이름
            vo.setLoc("Location_" + i);            // 부서 위치

            // 데이터 삽입
            dao.insert(vo);

            // 진행 상황 출력

                System.out.println( i + " 번째 데이터...");
            
        }

        System.out.println("200,000 records inserted successfully!");
    }
}


