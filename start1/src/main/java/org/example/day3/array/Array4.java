package org.example.day3.array;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[] a = new int[]{11, 22, 33, 44, 55};
        System.out.println(a[0]);
        System.out.println(a[3]);
        System.out.println(a[a.length - 1]);
        System.out.println(Arrays.toString(a));

        double[] b = new double[]{11.1, 22.2, 33.3};
        System.out.println(b[0]+b[1]);
        System.out.println(b[0]+b[b.length-1]);
        System.out.println(b.length);
        System.out.println(Arrays.toString(b));
    }
}