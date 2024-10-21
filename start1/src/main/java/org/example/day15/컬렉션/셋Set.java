package org.example.day15.컬렉션;

import java.util.*;

public class 셋Set {
    public static void main(String[] args) {
        //로또 중복되지 않은 값 6개, 랜덤하게.
        Random r = new Random();
        HashSet lotto = new HashSet();
        while (true) {
            lotto.add(r.nextInt(45) + 1);
            if(lotto.size()==6)
                break;
        }
        ArrayList<Integer> sortedLotto = new ArrayList<>(lotto);
        Collections.sort(sortedLotto);

            System.out.println(sortedLotto);


    }
}
