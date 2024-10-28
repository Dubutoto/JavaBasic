package org.example.day20.알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("숫자 입력>> ");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(numbers));
    }
}
