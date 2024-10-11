package org.example.day9.mainFile;

public class Item {
     String name;
     double price; // 다른 패키지에 있을시 public 을 붙여줘야함.

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
