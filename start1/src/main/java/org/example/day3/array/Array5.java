package org.example.day3.array;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
       char[] a = new char[4];
       a[0] = '남';
        System.out.println(a[0]);
        a[1] = '여';
        System.out.println(a[1]);
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

        String[] b = new String[3];
        b[0] = "Bristol";
        b[1] = "London";
        b[b.length-1] ="Bath";
        System.out.println(Arrays.toString(b));
        System.out.println("내가 첫번째로 가고싶은곳은 "+b[0]+" 이고 "+"마지막 가고싶은 곳은 "+b[2]+"이다");

    }
}