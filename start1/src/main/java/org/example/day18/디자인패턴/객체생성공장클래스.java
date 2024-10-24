package org.example.day18.디자인패턴;

public class 객체생성공장클래스 {
    public Object createObject(String name){
        if (name.equalsIgnoreCase("apple")){
            return new AppleClass();
        }else if (name.equalsIgnoreCase("banana")){
            return new BananaClass();
        }else{
            return null;
        }
    }
