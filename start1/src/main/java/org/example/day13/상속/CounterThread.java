package org.example.day13.상속;

public class CounterThread extends Thread {
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
            System.out.println("Counter: "+i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }

}
