package org.example.day10.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCheck3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();

        if(Pattern.matches("^[가-힣]{3,4}$", name)){
            System.out.println(name+"님 환영합니다!");
        }else{
            System.out.println("다시 입력해야합니다!");
        }

        System.out.println("Age: ");
        String age = scanner.nextLine();

        if(Pattern.matches("^\\d+$", age)){
            int x = Integer.parseInt(age);
            System.out.println(x-1+"세 입니다");
        }else{
            System.out.println("다시 입력해야합니다!");
        }

        System.out.println("Email: ");
        String email = scanner.nextLine();
        if(Pattern.matches("^[a-zA-Z0-9_]{5,8}@new\\.com$", email)) {
            System.out.println("이메일이 유효합니다");
        }else{
            System.out.println("이메일이 유효하지않습니다");
        }
        scanner.close();
    }
}
