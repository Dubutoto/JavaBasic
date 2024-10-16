package org.example.day12.inheritance;

public class UsingSuperMan {
    public static void main(String[] args) {
        SuperMan s = new SuperMan();
        s.gender = "male";
        s.name = "toto";
        s.strength = 33221;

        s.fly();
        s.sleep();

        System.out.println(s);
    }
}
