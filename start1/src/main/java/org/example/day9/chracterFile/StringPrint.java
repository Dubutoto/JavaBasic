package org.example.day9.chracterFile;

import java.util.ArrayList;
import java.util.HashSet;

public class StringPrint
{
    public static void main(String[] args) {
        //참조형 변수 프린트시
        //toString()을 먼저 호출하여 프린트할 스트링을 만들고 나서
        //그렇게 만들어진 스트링을 프린트한다.
        int[] n1 ={1, 2, 3}; // 배열 고정길이
        System.out.println(n1);

        ArrayList list = new ArrayList(); // 배열과 유사, 가변
        list.add(100);
        list.add(200);
        System.out.println(list); // [100.200]

        HashSet set = new HashSet(); // 가변 + 중복제거!
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(300);
        System.out.println(set); // [100, 200, 300]
    }
}
