package org.example.day13.상속;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGraphic extends JFrame {
    JLabel count, image, day; //전역변수 아무데서나 접근 가능

    public ThreadGraphic() {
        setSize(700,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("궁서",Font.BOLD, 80);

        count = new JLabel("카운트");
        image = new JLabel("이미지");
        day = new JLabel("년월일");


        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        //Jframe 에 끼워넣음
        add(count);
        add(image);
        add(day);


        CounterThread2 c = new CounterThread2();
        c.start();
        ArrayThread2 a = new ArrayThread2();
        a.start();
        TimeThread2 t = new TimeThread2();
        t.start();


        setVisible(true); //맨끝
    }

    public class TimeThread2 extends Thread{

        public void run(){
            for (int i = 0; i < 3000; i++) {
                System.out.println("시각 >> " + new Date());
                day.setText("시각 >> " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("문제가 생김.");
                }
            }
        }
    }

    public class CounterThread2 extends Thread {
        //필드
        //메서드 --> 기능이 중요
        //public void run({} : 동시에 실행하고 싶은 내용 비어있는 상태
        //
        //public void start(){}
        //JVM 은 실행목록을 가지고 있음
        //      실행할 것들을 실행목록에 리스트업해두고
        //      스레드는 왔다갔다하면서 조금씩 실행함.
        public void run(){
            for(int i= 500; i >0; i--){
                System.out.println("Count: "+i);
                count.setText("Count: "+i);
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }

        }

    }

    public class ArrayThread2 extends Thread {
        String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

        public void run(){
            for (int i = 0; i < foods.length; i++) {
                System.out.println("배열 >> " + foods[i]);
                ImageIcon icon = new ImageIcon(foods[i]);
                image.setIcon(icon);
                try{
                    Thread.sleep(3000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }



}
