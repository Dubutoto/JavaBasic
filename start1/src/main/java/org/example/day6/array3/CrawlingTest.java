package org.example.day6.array3;

import org.jsoup.Jsoup;

public class CrawlingTest {
    public static void main(String[] args) {
        Jsoup.connect("https://finance.naver.com/sise/");
        System.out.println("Successful connection");
    }
}
