package org.example.day15.제너릭;

public class Truck사용 {
    public static void main(String[] args) {
        Truck<String, Integer> truck1 = new Truck<>();
        truck1.무게 = "중량무게";
        truck1.거리 = 100;

        Truck<Double, String> truck2 = new Truck<>();
        truck2.무게 = 133.3;
        truck2.거리 = "장거리";

        System.out.println(truck1);
        System.out.println(truck2);

    }
}
