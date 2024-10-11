package org.example.day9.mainFile;

import java.util.Scanner;

public class Order2 {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "햄버거";
        item1.price = 50.5;
        Item item2 = new Item();
        item2.name = "냉면";
        item2.price = 60.5;
        Item item3 = new Item();
        item3.name = "커피";
        item3.price = 5.5;

        Item[] items = {item1, item2, item3};
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("메뉴 번호를 입력, 3개 모두 주문 완료되었으면 'x' 입력");
            System.out.println("주문 가능한 메뉴입니다.");
            System.out.println("==========================================");
            for(int i = 0; i< items.length;i++){
                System.out.println(items[i].name+": "+items[i].price);
            }

        }
    }
}
