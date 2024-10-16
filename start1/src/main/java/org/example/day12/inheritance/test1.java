package org.example.day12.inheritance;

public class test1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "John Doe";
        m.address = "123 Main St";
        m.salary = 50000;

        m.test();  // Manager 클래스의 test() 메서드 호출
    }
}
