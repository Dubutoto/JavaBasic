package org.example.day6.array3;

import javax.swing.*;

public class sdArray3 {
    public static void main(String[] args) {
        //전체 프레임이 필요
        //new를 이용해서 부품을 만들어 램에 넣어둠.
        JFrame frame = new JFrame();
        //1. new JFrame(): JFrame을 램에 넣어둔다.
        //2. frame = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame frame: frame라는 변수에는 JFrame이 들어있는 주소를 넣어두었다를 표시
        //   --> 이렇게 쓰면 frame에는 JFrame이 저장된 위치만 넣을 수 있고,
        //       다른 부품의 위치는 넣을 수 없음.
        frame.setSize(500,500);
        frame.setTitle("Array3");

     String[] header = {"Korean","English","Mathematics"};
     Integer[][] contents = {
             {1,2,3},
             {1,2,3},
             {1,2,3},
             {1,2,3}
     };
     JTable table = new JTable(contents,header);
     //JTable table = new JTable(2차원 배열 데이터, 1차원의 항목명);

     JScrollPane scroll = new JScrollPane(table);
     frame.add(scroll);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
    }
}
