package org.example.day11.스태틱;

public class UsingWorkOut {
    public static void main(String[] args) {
        WorkOut w1 = new WorkOut("테니스","친구",3);
        WorkOut w2 = new WorkOut("러닝","동네모임",2);

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w1.count);

        System.out.println(w1.getTime());
    }
}
