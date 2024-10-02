package org.example.day5.array2;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {

        //Basic Copy //shallow copy


        int [] term1 ={100, 200, 300};
        int [] term2 = term1; // 주소 복사
        term2[0] = 96;    //주소를 가리키는 것 원래값 자체가 변해버림.
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));

        //Deep Copy 를 해야 원본 데이터가 안바뀜



    }
}
