package org.example.day7.makeclass;


public class DailyDiary {
    public static void main(String[] args) {
        DiaryData day1 = new DiaryData();
        //day1 ==> 참조형변수(주소)
        //주소를 가지고 필드접근, 멤버메서드 실행할 수 있음!
        day1.title = "목요일이닷!";
        day1.content = "와~ 금요일이닷!";
        day1.weather = "흐림";

        day1.writeDiary();
        System.out.println(day1.title + " " + day1.content + " " + day1.weather);
    }
}
