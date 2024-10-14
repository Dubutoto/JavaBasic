package org.example.day10.question;

public class Q3class {
    String name;
    int age;
    String gender;
    static int count;
    static int totalAge;

    public Q3class(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
        totalAge += age;
    }

    @Override
    public String toString() {
        return "Q3class: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                " ";
    }
}
