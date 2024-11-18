package org.example.jdbc4.Question;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_UI {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");

        Q_DAO dao = new Q_DAO(); //1-2단계 실행!

        /*
        Q_VO bag = dao.one(2); //3-4단계

        System.out.println("검색한 No>> " + bag.getProductID());
        System.out.println("검색한 Name>> " + bag.getProductName());
        System.out.println("검색한 Price>> " + bag.getPrice());
        System.out.println("검색한 Quantity>> " + bag.getQuantity());
        */

        // 전체 리스트 출력 예제
        ArrayList<Q_VO> list = dao.list();
        if (list == null) {
            System.out.println("DB에 데이터가 없습니다.");
        } else {
            System.out.println("\n전체 검색 결과:");
            for (Q_VO bag : list) {
                System.out.println("No>> " + bag.getProductID());
                System.out.println("Name>> " + bag.getProductName());
                System.out.println("Price>> " + bag.getPrice());
                System.out.println("Quantity>> " + bag.getQuantity());
                System.out.println("-----------------------------");
            }
        }
    }
}
