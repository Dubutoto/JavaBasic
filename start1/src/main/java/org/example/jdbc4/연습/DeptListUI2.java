package org.example.jdbc4.연습;

import java.util.ArrayList;

public class DeptListUI2 {
    public static void main(String[] args) throws Exception {
        DeptDAO2 dao = new DeptDAO2();
        ArrayList<DeptVO2> list = dao.list();
        //모든 리스트를 가지고 오자.
        for (DeptVO2 bag : list) {
            System.out.println("검색한 no>> " + bag.getDeptno());
            System.out.println("검색한 name>> " + bag.getDname());
            System.out.println("검색한 loc>> " + bag.getLoc());
            System.out.println("-----------------------------");
        }
    }
}
