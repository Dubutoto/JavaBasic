package org.example.day18.디자인패턴;

import java.util.Scanner;

public class 객체생성공장사용 {
    public static void main(String[] args) {
        객체생성공장클래스 factory = new 객체생성공장클래스();
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("어떤 객체를 생성하시겠습니까?");
            String userInput = scanner.nextLine();

            if(userInput.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            Object obj = factory.createObject(userInput);
            if(obj == null){
                System.out.println("유효하지 않은 입력입니다. 다시 시도해주세요");

            }else{
                System.out.println(userInput + "가 입력되었습니다.");
            }
        }
        scanner.close();
    }
}
