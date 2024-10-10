package org.example.day8.makeclass;

public class Calculator {
    //필드 X
    public void add(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public void subtract(int x, int y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }

    public void multiply(int x, int y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }

    public void division(int x, int y) {
        System.out.println(x + " // " + y + " = " + (x / y));
    }
}
