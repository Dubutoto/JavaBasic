package org.example.day18.람다식;

public class UseSumInterface {
    public static void main(String[] args) {
        SumInterface sum = (a,b) -> a + b; //구현내용;
        System.out.println(sum.add(100,200));

        SumInterface sum2 = (a,b) -> (a + 100) + (b - 200); //구현내용;
        System.out.println(sum2.add(100,200));
    }
}
