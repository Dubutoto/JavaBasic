package org.example.day4.array;

public class ArrayComparison {
    public static void main(String[] args) {
        int[] n1 = {44, 66, 77, 22, 11};
        int[] n2 = {33, 55, 77, 22, 40};
        String[] subject = {"Korean","Mathematics","English","Science","Physics"};

        //1. 1학기 2학기 동일한 점수인 과목수, 동일하지 않은 점수인 과목수
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < n1.length; i++) {
            if (n1[i] == n2[i]) {
                count1++;
            }else{
                count2++;
                if(n1[i] < n2[i]){
                    count3++;
                }
            }
        }
        System.out.println("점수 동일: " + count1);
        System.out.println("점수 다름: " + count2);
        //2. 2학기에 성적이 오른 과목수
        System.out.println("2학기에 성적이 오른 과목수: " + count3);


        //3. 2학기에 성적이 오른 과목명
        for (int i = 0; i < n1.length; i++) {

            if (n1[i] < n2[i]) {
                System.out.println(subject[i]);
            }
        }
    }
}
