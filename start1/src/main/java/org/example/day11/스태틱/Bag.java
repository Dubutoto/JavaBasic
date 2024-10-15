package org.example.day11.스태틱;

public class Bag {
    String brand;
    int price;
    int rank;
    int tVolume;
    static int count;
    private static int totalVolume;

    public Bag(String brand, int price, int rank, int tVolume) {
        this.brand = brand;
        this.price = price;
        this.rank = rank;
        this.tVolume = tVolume;
        count++;
        totalVolume = totalVolume + tVolume;
    }

    public static int getTotalVolume() {
        return totalVolume;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", rank=" + rank +
                ", tVolume=" + tVolume +
                '}';
    }
}
