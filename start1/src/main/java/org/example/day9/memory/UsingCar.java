package org.example.day9.memory;

public class UsingCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        //Car(틀, class) --new--> car1 객체생성
        //car1 : 클래스의 인스턴스, 객체(object)
        //new 로 객체 생성한 경우 멤버변수가
        //힙영역에 생성된다.
        //new 할 때마다(객체생성할 때마다 각각의 멤버변수들이
        //힙영역에 만들어진다.
        car1.size = 10;
        car1.speed = 20;
        System.out.println(car1.print());

        car1.hi(); // void 는 프린트할수없음
        int age = 100;
        System.out.println("내 나이는 "+ age);
        //객체,메서드 도식화,그림 분석
        //T자형 메모리
        //

    }
}
