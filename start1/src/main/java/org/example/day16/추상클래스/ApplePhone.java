package org.example.day16.추상클래스;

public abstract class ApplePhone implements MegaPhone {

    int size;

    public abstract void camera();
    //상속받은 곳에서 반드시 구현하도록 강제성을 클래스에서 지정하고 싶을때
    //클래스내에서 추상메서드 사용 가능
    @Override
    public void siri() {
        System.out.println("시리 기능 구현");
    }

    @Override
    public void map() {
        System.out.println("지도 기능 구현");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 기능 구현");
    }

    @Override
    public void call() {
        System.out.println("전화 기능 구현");
    }

    @Override
    public void text() {
        System.out.println("메모 기능 구현");
    }

    @Override
    public void kakao() {
        System.out.println("카카오 기능 구현");
    }
}
