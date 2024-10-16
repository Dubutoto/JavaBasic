package org.example.day12.inheritance;

public class UsingTruck {
    public static void main(String[] args) {
        Truck t = new Truck();
        t.colour = "red";
        t.speed = 100;
        t.weight = 1;
        System.out.println(t);
        t.drive(); //car
        t.move(); //truck
        t.stop();//car

    }
}
