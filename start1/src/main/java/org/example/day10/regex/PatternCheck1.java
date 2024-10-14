package org.example.day10.regex;

import java.util.regex.Pattern;

public class PatternCheck1 {
    public static void main(String[] args) {
        String pt = "^[a-zA-Z]*$";
        String str1 = "abcaa";
        String str2 = "123";
        String str3 = "abc";

        boolean result1 = Pattern.matches(pt, str1);
        boolean result2 = Pattern.matches(pt, str2);
        boolean result3 = Pattern.matches(pt, str3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
