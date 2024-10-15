package org.example.day11.스태틱;

public class UsingBag {
    public static void main(String[] args) {
        Bag bag1 = new Bag("Arc\'teryx",207000,1, 18000);
        Bag bag2 = new Bag("Longchamp",125000,2,15000);
        Bag bag3 = new Bag("Uniqlo",60000,3,1478);
        Bag bag4 = new Bag("Salomon",96000,4,771);
        Bag bag5 = new Bag("Matin Kim",125000,5,3939);

        System.out.println(bag1);
        System.out.println(bag2);
        System.out.println(bag3);
        System.out.println(bag4);
        System.out.println(bag5);
        System.out.println(bag1.count);
        System.out.println(Bag.getTotalVolume());
    }
}
