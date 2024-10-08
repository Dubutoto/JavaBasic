package org.example.day7.makeclass;

public class Television {
    //속성 (특징, 특성): attribute, property = > 내가 클래스 만들 때 넣을 속성들
    //항목 : item, field(필드, *)
    //      사이즈, 가격, 제조회사 ==> 변수(멤버 변수)
    //다른 항목들을 선택할 수 있었지만 내가 선택한 이 항목으로 변수를 만들겠다. ==> 멤버변수

    public String size; // 전역변수, 자동초기화, null 로 초기화
    public int price;   //                  0 으로
    public String manufacturer;
    public String retailer;

    //기능(동작) : function, method(메서드, 절차/방법)
    //전원을 켜다. 전원을 끄다, 채널을 바꾸다.
    // 멤버 메서드
    public void powerOn(){
        //전원을 켜기 위한 방법과 절차
        System.out.println("Television power on");
    }

    public void powerOff(){
        //전원을 끄기 위한 방법과 절차
        System.out.println("Television power off");
    }

    public void changeChannel(int channel){
        System.out.println("Changed channel to "+channel);
    }

}
