package org.example.day11.스태틱;

public class AccountData {
    int number;
    String name;
    int balance;
    static int count;

    public AccountData(int number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        count++;
    }

    @Override
    public String toString() {
        return "AccountData: " +
                "number=" + number +
                ", name='" + name + '\'' +
                ", balance=" + balance;
    }
}
