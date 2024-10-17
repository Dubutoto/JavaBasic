package org.example.day13.상속;

public class ArrayThread extends Thread {
    String[] foods = {"1.png", "2.png", "3.png", "4.png", "5.png"};

    public void run(){
        for (int i = 0; i < foods.length; i++) {
            System.out.println("배열 >> " + foods[i]);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
