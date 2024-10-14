package org.example.day10.constuctor;

public class Car {
    //필드, 멤버 변수
    String model;
    String color;
    int maxSpeed;

    //멤버 메서드
    public void speedUp(){
        System.out.println("속도 UP!");
    }
    // public Car(){
    // 컴파일시, 내용도 없고 파라메터도 없는 생성자가 자동으로 만들어짐.
    // }
    // 묵시적으로 생성
    // 클래스이름과 동일
    // 내용도 없는 메서드 생성(실행되는 내용 없다.!)
    // 프로그래머가 하나도 생성자를 만들어주지 않은 경우에만 자동 생성됨!
    // 파라메터없는 생성자 메서드(constructor)
    // default constructor
    // 멤버 메서드
    // ==> 묵시적 생성자는 내용이 없음!(객체생성해도 실행되는 것이 없음).
    // ==> 명시적 생성자는 객체생성시 무엇인가 실행되는 것을
    // 넣고 싶은 경우(ex. 알림, 객체생성개수 등)
    public Car(){

    }

    Car(String model){
        this.model = model;
    }


}
