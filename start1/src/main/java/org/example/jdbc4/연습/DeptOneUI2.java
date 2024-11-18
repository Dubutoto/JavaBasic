package org.example.jdbc4.연습;

public class DeptOneUI2 {
    public static void main(String[] args) throws Exception {
        DeptDAO2 dao = new DeptDAO2(); //1-2단계 실행!
        DeptVO2 bag = dao.one(1); //3-4단계

        System.out.println("검색한 no>> " + bag.getDeptno());
        System.out.println("검색한 name>> " + bag.getDname());
        System.out.println("검색한 loc>> " + bag.getLoc());
    }
}
