package org.example.day10.constuctor;

public class UsingCar {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Tesla";
        c1.color = "Blue";
        c1.maxSpeed = 140;

        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.maxSpeed);

        c1.speedUp();

        Car c2 = new Car();
        c2.model = "Porsche";
        c2.color = "Black";
        c2.maxSpeed = 180;

        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.maxSpeed);


    }
}
