package org.example.day14.크롤링;

import java.util.ArrayList;

public class ListTest {
    public static void main(String[] args) {
        //고정, 여러개 ==> 배열
        //가변, 여러개 ==> ArrayList
        //Elements(자식) --> ArrayList(부모)
        ArrayList list = new ArrayList();
        //값을 넣어보고 {"검색, "메일", "카페"}
        list.add("검색");
        list.add("메일");
        list.add("카페");
        //전체 출력
        System.out.println(list);
        System.out.println(list.get(0));
        //몇 개인지 세어보고
        //인덱스로 접근해서 꺼내보고
        //지워보고.
        list.remove(2);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for(Object x : list){
            System.out.println(x);
        }
    }
}
