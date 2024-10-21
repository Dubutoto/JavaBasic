package org.example.day15.컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        //한번 갔던 여행지는 가지 않으려고 함, 가고싶은 여행지 5곳
        //전체프린트 set
        HashSet location = new HashSet();
        location.add("London");
        location.add("Santorini");
        location.add("Bristol");
        location.add("Bath");
        location.add("Barcelona");
        location.add("Barcelona");
        System.out.println(location);
        System.out.println(location.size());
        //반복문이용해서 하나씩 꺼내와서 처리
        //순서X, 인덱스없음
        //인덱스가 없어도 for-each 는 가능.

        //반복해서 꺼내주는 부품을 달아주세요.
        //반복자(iterator)
        Iterator it = location.iterator();

        while(it.hasNext()){
                System.out.println(it.next());
        }







        // 각 방에 물건 배치, 안방에는 TV, 거실에는 쇼파, 부엌에는 냉장고
        // 정보를 컬렉션으로 만들어서 1)전체 프린트 2)현관에는 무엇이 있나
       // Map furniture = new HashMap();



        // 오늘 내가 할일 우선순위 5개 목록을 만들어서 1)전체프린트 2)


        //
    }
}
