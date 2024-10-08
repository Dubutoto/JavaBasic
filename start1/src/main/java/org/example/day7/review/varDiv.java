package org.example.day7.review;

public class varDiv {
    int z = 0; // 전역변수 -- > 자동초기화가 됨.

    public static void main(String[] args) {
        //저장공간 만들고, 그 저장공간에 값을 넣는다.
        //선언할때 --> 저장공간을 만든다.
        //타입명 변수명; --> 선언!
        int x; // 쓰레기 값이 들어가있는 상태
        int y = 0; // 변수 만들 떄 초기화를 꼭 해주자.
        // 지역변수 (local variable)
        //==> 자바에서는 선언의 위치가 이 변수가 사용될 수 있는 범위를 결정!
        //==> x, y변수는 main() 메서드내에서만 사용 가능하다,

        for(int i=0; i<3; i++){
            int imsi = 0;
            // for 문 안에서만 사용가능한 지역변수.(지역변수는 자동으로 초기화를 안해줌)   <-------> 전역변수 (Global)
        }
    }
}
