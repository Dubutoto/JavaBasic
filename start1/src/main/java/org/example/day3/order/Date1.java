package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //입력할 떄 자동으로 년월일, 시분초로 구해주고 싶다
        Date date = new Date();
        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        int date1 = date.getDate();
        int day = date.getDay();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();
        String dayK= null;

        switch(day) {
            case 1:
                dayK = "월요일";
                break;
            case 2:
                dayK = "화요일";
                break;
            case 3:
                dayK = "수요일";
                break;
            case 4:
                dayK = "목요일";
                break;
            case 5:
                dayK = "금요일";
                break;
            case 6:
                dayK = "토요일";
                break;
            case 7:
                dayK = "일요일";
                break;
        }

        System.out.println(year+" "+month+" "+date1+" "+dayK+" "+hour+" "+minute+" "+second);

        //오늘 무슨 요일인가




    }
}
