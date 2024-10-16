package org.example.day12.inheritance;

public class Staff {
    String name;
    String address;
    protected int salary;
    private int rrn;



    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", rrn=" + rrn +
                '}';
    }
}
