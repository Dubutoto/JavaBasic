package org.example.day8.makeclass;

import java.util.Date;

public class Calc2 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, int b) {
        return a + b;
    }

    public int[] add(){
        int[] num = {1,2,3};
        return num;
    }
    public int call(){
        Date date = new Date();
        int month = date.getMonth() + 1;
        return month;
    }
}
