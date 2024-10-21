package org.example.day15.참조형형변환;

public class 참조형2 {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck(); //Car(부모) <--- Truck(자식)
        Human human = new Human(); //Car, Truck 상관없음.

        car = truck; //부모클래스(개념적으로 크다.) <-- 자식클래스 (개념적으로 작다.)
        truck = (Truck)car; //자식(작) <-- 부모(크)
        // person = car;
    }
}
