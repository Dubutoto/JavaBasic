package org.example.day20.알고리즘;

public class Test {
    public static void main(String[] args) {
        int num = 98;
        int n = 2;
    }
}

class Solution {
    public int solution(int num, int n) {

        if(num%n==0){
            return 1;
        }else{
            return 0;
        }

    }
}
