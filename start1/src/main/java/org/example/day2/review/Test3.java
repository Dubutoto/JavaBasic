
package org.example.day2.review;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press your ID: ");
        String id = sc.nextLine();
        System.out.println("Press your PW: ");
        String pw = sc.nextLine();



        System.out.println(id.equals("root") && pw.equals("1234"));

    }
}
