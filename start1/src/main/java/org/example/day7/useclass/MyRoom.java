package org.example.day7.useclass;

import org.example.day7.makeclass.Dog;
import org.example.day7.makeclass.TV;
import org.example.day7.makeclass.Television;
//헤더 파일 위치 명시


public class MyRoom {
    public static void main(String[] args) {
        Television tv = new Television();
        TV myTv = new TV();
        TV yourTv = new TV();
        tv.powerOn();
        tv.changeChannel(14);
        tv.powerOff();
        Dog dog = new Dog();
        dog.bark();
        dog.run();

        dog.age = 8;
        dog.name = "toto";
        tv.size = "small";
        tv.price = 10000;

        System.out.println(tv.size);
        System.out.println(tv.price);
        System.out.println(tv.manufacturer);
        System.out.println(tv.retailer);
        System.out.println(dog.name);
        System.out.println(dog.age);

        //OOP, 객체, 메서드, 함수, 멤버변수, 주소, 인스턴스 개념정리.
    }


}
