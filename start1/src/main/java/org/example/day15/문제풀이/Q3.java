package org.example.day15.문제풀이;

import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("자바");

        // list.add(new 사람());
        list.add(new ArrayList());

        String s = (String) list.get(0); //강제 형변환

        list.add(100);

        int i = (Integer) list.get(3);
    }
}
