package org.example.day13.question;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread extends Thread {
    public void run() {

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

        for (int i = 0; i < 300; i++) {
            // 현재 시간을 "HH:mm:ss" 형식으로 출력
            System.out.println("Time: " + timeFormat.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
