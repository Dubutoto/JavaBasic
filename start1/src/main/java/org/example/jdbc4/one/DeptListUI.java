package org.example.jdbc4.one;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptListUI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO dao = new DeptDAO();
        ArrayList<DeptVO> list = dao.list();
        //모든 리스트를 가지고 오자.
        for (DeptVO bag : list) {
            System.out.println("검색한 no>> " + bag.getDeptno());
            System.out.println("검색한 name>> " + bag.getDname());
            System.out.println("검색한 loc>> " + bag.getLoc());
            System.out.println("-----------------------------");
        }

        



    }
}
