package org.example.day13.상속;

import java.util.Date;

public class TimeThread extends Thread {

    public void run(){
        for(int i= 0; i < 3000; i++){
            System.out.println("Counter: " + new Date());
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
