package org.example.day16.추상클래스;

public class 전화기사용 {
    public static void main(String[] args) {
        // MegaPhone p1 = new MegaPhone();
        // ApplePhone p2 = new ApplePhone();
        ApplePhone1 p3 = new ApplePhone1();
        ApplePhone2 p4 = new ApplePhone2();
        ApplePhone p5 = p3;
        System.out.println(MegaPhone.DATA);
    }
}
