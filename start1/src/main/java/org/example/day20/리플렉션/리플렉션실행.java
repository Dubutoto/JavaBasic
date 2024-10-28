package org.example.day20.리플렉션;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class 리플렉션실행 {
    public static void main(String[] args) {
        try{
            //클래스 실행시에 로딩하라고 설정.
            Class<?> clazz = Class.forName("org.example.day20.리플렉션.Person");
            //생성자 정보 획득
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            //생성자호출해서 객체를 생성해보자.
            Object person = constructor.newInstance("John", 30);

            //메서드 정보(객체) 획득
            Method setName = clazz.getMethod("setName", String.class);
            setName.invoke(person, "Jane"); //실행!
            Method getName = clazz.getMethod("getName");
            System.out.println(getName.invoke(person));
            Field age = clazz.getDeclaredField("age");
            age.setAccessible(true);
            age.setInt(person, 35);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
