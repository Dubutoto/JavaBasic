package org.example.day11.스태틱;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3, 5, 7, 9, 1};
        //정렬! 오름차순!
        Arrays.sort(n); //파괴형메서드
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        String s = Arrays.toString(n); //비파괴형메서드
        System.out.println(s);

        Random random = new Random();
        System.out.println(random.nextDouble());

        for (int i = 0; i < 5; i++) {
            double n2 = Math.random();
            System.out.println(n2);//double
            System.out.println(n2 * 100000000);
            //0~0.9999
            System.out.println((int)(n2 * 10));


            Calendar cal = Calendar.getInstance();
            System.out.println(cal);
            System.out.println(cal.get(Calendar.YEAR));
            System.out.println(cal.get(Calendar.MONTH));
            System.out.println(cal.get(Calendar.DAY_OF_MONTH));
            System.out.println(cal.get(Calendar.HOUR_OF_DAY));
            System.out.println(cal.get(Calendar.MINUTE));
            System.out.println(cal.get(Calendar.SECOND));
            System.out.println(cal.get(Calendar.MILLISECOND));

        }
    }
}
