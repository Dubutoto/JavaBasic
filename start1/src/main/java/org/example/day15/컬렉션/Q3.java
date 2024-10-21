package org.example.day15.컬렉션;

import java.util.Iterator;
import java.util.LinkedList;

public class Q3 {
    public static void main(String[] args) {
        //list
        LinkedList list = new LinkedList<>();
        list.add("수업듣기");
        list.add("문제풀기");
        list.add("밥먹기");
        list.add("오후수업");
        list.add("문제풀기2");
        System.out.println(list);
        //단순 for 문
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //for-each 가능
        for(Object o : list){
            System.out.println(o);
        }

        //iterator
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
