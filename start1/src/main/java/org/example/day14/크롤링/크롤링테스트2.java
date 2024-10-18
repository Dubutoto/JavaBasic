package org.example.day14.크롤링;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트2 {
    public static void main(String[] args) throws Exception {
        Document doc2 = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();

        Elements list = doc2.select("span.code");
        System.out.println(list);
        System.out.println(list.size());
        Element e1 = list.get(0); //<span class="code">005930</span>
        String code = e1.text();
        System.out.println(code);

        Elements list2 = doc2.select("span.tx");
        for(int i= 0; i<list2.size(); i++){
            Element e2 = list2.get(i);
            String st = e2.text();
            System.out.println(st);
        }


        Elements list3 = doc2.select("div.today span.blind");//문자열 양식 체크
        System.out.println(list3);
        Element e3 = list3.get(0);
        String x = e3.text();
        System.out.println(x);
    }
}
