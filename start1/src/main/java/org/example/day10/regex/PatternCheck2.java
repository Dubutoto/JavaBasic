package org.example.day10.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCheck2 {
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile("^[a-zA-Z]*$");
        String str1 = "abcaa";
        String str2 = "123";
        String str3 = "abc";

        Matcher result1 = pattern.matcher(str1);
        Matcher result2 = pattern.matcher(str2);
        Matcher result3 = pattern.matcher(str3);

        System.out.println(result1.find());
        System.out.println(result2.find());
        System.out.println(result3.find());
    }
}
