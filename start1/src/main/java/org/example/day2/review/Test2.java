
package org.example.day2.review;

public class Test2 {
    public static void main(String[] args) {
        int x = 333;
        int y = 222;
        int sum = x + y;
        int minus = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y;

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        System.out.println(x == y);
        System.out.println(x >= y);   //논리 연산자

        char id = 'a';
        char pw = 'b';
        //and(&&)
        System.out.println(id == 'a' && pw == 'b');
        System.out.println(id == 'a' && pw == 'c');
        //or(||)
        char pw1 = 'j';
        char pw2 = 'k';
        System.out.println(id == 'j' || pw2 == 'k');


    }
}
