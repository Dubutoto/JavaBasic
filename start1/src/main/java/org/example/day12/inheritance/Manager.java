package org.example.day12.inheritance;

public class Manager extends Staff {
    private int bonus;

    public void test(){
        System.out.println(super.toString());
        System.out.println("This is a test method in the Manage class");
    }
}
