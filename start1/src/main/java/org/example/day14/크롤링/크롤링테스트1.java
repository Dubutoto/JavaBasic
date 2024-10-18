package org.example.day14.크롤링;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링테스트1 { //줄별로 gpt 설명 참조할것.
    public static void main(String[] args) throws Exception {
       //  String s = JOptionPane.showInputDialog("날씨 입력"); //return 이 String
        Connection con = Jsoup.connect("https://www.naver.com/"); //return 이 Connection
        //Connection: 연결통로를 나타내는 스트림 객체
        Document doc = con.get(); //return Document
        //Document
        //Document doc2 = Jsoup.connect("https://www.naver.com/").get();
        System.out.println(doc); //코드를 String 으로 만들어줌.
        System.out.println("설치 성공");

        Elements list = doc.select("span.blind");
        System.out.println(list.size());
        System.out.println(list);
        Element e1= list.get(0);
        String e1Text = e1.text();
        System.out.println(e1Text);
    }
}
