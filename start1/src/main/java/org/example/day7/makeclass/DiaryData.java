package org.example.day7.makeclass;

public class DiaryData {
    //속성 --> 항목(필드), 멤버변수
    String title;
    String content;
    String weather;

    //기능 메서드 -->
    //void(없다)
    public void writeDiary(){
        System.out.println("그림넣고");
        System.out.println("제목넣고, 내용쓰고, 날씨를 쓴다.");
    }

    public void deleteDiary(){
        System.out.println("파일을 삭제");
    }
}
