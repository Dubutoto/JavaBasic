package org.example.day15.참조형형변환;

public class Truck extends Car {
    //묵시적
    //필드: 2개
    //메서드: 2개


    //트럭의 특징에 필드 + 메서드 추가!
    int weight;
    public void move(){
        System.out.println("속도로 짐을 나르다");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                '}';
    }
}
