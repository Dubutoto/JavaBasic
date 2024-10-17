package org.example.day13.상속;

public class ArrayThread extends Thread {
    String[] foods = {"a", "b", "c", "d", "e", "f"};

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
