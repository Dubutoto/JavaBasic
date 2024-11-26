package org.example.dbcp;

public class DBCP사용 {
    public static void main(String[] args) {
        DBCP dbcp1 = DBCP.getInstance();
        DBCP dbcp2 = DBCP.getInstance();
        System.out.println(dbcp1);
        System.out.println(dbcp2);
    }
}
