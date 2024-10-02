package org.example.day5.review;

public class exam1 {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {77, 100, 88, 80, 70};
        // String[] subject = {"Mathematics", "English", "Physics", "Chemistry", "Programming"};
        int countInc = 0;
        int countSame = 0;

        for (int i = 0; i < term1.length; i++) {
            if(term1[i] < term2[i]) {
                countInc++;
        } else if(term1[i] == term2[i]) {
                countSame++;
            }
        }
        System.out.println("성적이 향상된 학생의 수: "+countInc+"명");
        System.out.println("성적이 유지된 학생의 수: "+countSame+"명");
    }
}
