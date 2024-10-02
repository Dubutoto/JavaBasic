package org.example.day5.array2;

import java.util.ArrayList;
import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {

        //Deep Copy 를 해야 원본 데이터가 안바뀜
        /*
        int []term1 = {100,200,300};
        int []term2 = term1.clone();
        term2[0] = 96;
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));
        */
        //Q

        String[] subject ={"Korean","English","Mathematics","Computer","Speaking"};
        int []term1 = {44,66,22,99,100};
        int []term2 = term1.clone(); //Can not be used in Multidimensional Array

        term2[0] = 66;
        term2[2] = 88;
        System.out.println(Arrays.toString(term1));
        System.out.println(Arrays.toString(term2));

        int countSame = 0;
        int countDifferent = 0;
        ArrayList<String> incSubjects = new ArrayList<>();  // 변경된 과목 리스트

        for(int i=0;i<term1.length;i++){
            if(term1[i]==term2[i]){
                countSame++;
            }

            if(term1[i]<term2[i]){
                countDifferent++;
                incSubjects.add(subject[i]);
            }
        }
        System.out.println(countSame);
        System.out.println(countDifferent);
        System.out.println(Arrays.toString(incSubjects.toArray()));
    }
}
