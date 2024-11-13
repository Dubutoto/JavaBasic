package org.example.jdbc;

import java.sql.Connection;
import java.util.Date;

public class 리턴연습Main {
    public static void main(String[] args) throws Exception {
        리턴연습 test = new 리턴연습();
        int[] arr = test.getArray(); //int[]
        System.out.println(arr[0] + arr[1]);

        Connection con = test.getConnection("http://www.naver.com","root","");
        con.setAutoCommit(false);

        Connection con2 = test.getConnection("http://www.naver.com");


            Date date = test.getDate(); //호출했을 때의 년월일시분초
            System.out.println(date);

            int result = test.getSum(100);
            System.out.println("보너스까지 추가된 금액은:"+result);

            test.getSum(2000, 3000);

    }
}
