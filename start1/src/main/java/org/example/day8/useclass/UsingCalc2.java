package org.example.day8.useclass;

import org.example.day8.makeclass.Calc2;

import java.util.Arrays;

public class UsingCalc2 {
    public static void main(String[] args) {
        Calc2 calc2 = new Calc2();
        System.out.println(calc2.add(3, 5.4));
        System.out.println(calc2.add(3.3,5.1));
        System.out.println(calc2.add("Good",5));
        System.out.println(calc2.add());
        int[] result = calc2.add();
        int[] wArray = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            wArray[i]=result[i];
            System.out.println(wArray[i]);
        }
        System.out.println(Arrays.toString(calc2.add()));

        System.out.println(calc2.call());

    }
}
