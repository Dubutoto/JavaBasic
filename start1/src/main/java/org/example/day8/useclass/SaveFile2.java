package org.example.day8.useclass;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class SaveFile2 {
    public static void main(String[] args) {
        //주말동안 할 일 입력받아 저장
        //할 일이 "운동" 이면 파일명은 "운동.txt"
        //저장 위치는 c:/data/운동.txt 로생성되게 하시오.
        //입력은 2회 받음.
        //1. 주말동안 할 일은?   (예, 운동, 코딩, 여행 등)
        //2. 구체적인 내용 입력?  (예, 장소시간-내용을 입력)
        //파일은 3개 이상 만들어지도록 처리
        String task = JOptionPane.showInputDialog("주말동안 할 일은?");
        String contents = JOptionPane.showInputDialog("구체적인 내용 입력");
        Date date = new Date();

        String ymd = date.getYear()+1900+""+date.getMonth()+1+""+date.getDate();
        String hms = date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
        String time = ymd+hms;
        String[] total = time.split("-");

        try {
            FileWriter f = new FileWriter("/Users/vf20093/Desktop/data/"+task+".txt");
            for (String x : total){
                f.write(x+"\n");
            }
            f.write(task +"\n");
            f.write(contents);
            f.close();

            // 통로(자바-외부파일/네트워크 열결), 연결(connection)
            // 스트림(강물), stream
        } catch (IOException e) {
            System.out.println("파일 다룰 때 에러가 발생함");
            e.printStackTrace(); //에러 정보 구체적으로 프린트
            e.getMessage(); // 에러 정보 간단하게 스트링으로 리턴!

        }
    }
}
