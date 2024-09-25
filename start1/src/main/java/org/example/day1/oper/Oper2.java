package org.example.day1.oper;

public class Oper2
    {
        public static void main(String[] args)
        {
            int x = 200;
            int y = 100;

            int sum = x + y;
            System.out.println(sum);

            double div = y / x;

            double div2 = (double)y /x;
            //cpu 가 값을 가지고 와서 실수로 변경해주어야함 이것을 Casting 이라함.
            System.out.println(div2);

        }
    }
