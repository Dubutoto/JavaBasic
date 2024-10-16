package org.example.day12.inheritance;

import java.util.ArrayList;
import java.util.Date;

public class 상속응용 {
    public static void main(String[] args) {
        //고정, 같은 타입, 많은 수 --> 배열
        //가변, 같은(다른)타입, 많은 수 --> ArrayList
        ArrayList list = new ArrayList();
        list.add(10000);
        list.add(20000);
        list.add("볼펜");
        list.add(new Date());
        System.out.println(list);
        list.remove("볼펜");
        list.remove(0);
        System.out.println(list);
        System.out.println("-------------------------------");

        Object[] list2 = new Object[2];
        list2[0] = 100;
        list2[1] = "감사합니다.";

    }
}
