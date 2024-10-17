package org.example.day13.question;

public class EvenThread extends Thread {
    public void run(){
        for(int i= 2; i <=500; i++){
            if(i%2==0){
                System.out.println(i);
            }
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
