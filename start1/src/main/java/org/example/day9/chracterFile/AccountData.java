package org.example.day9.chracterFile;

public class AccountData {
    String name;
    String ssn;
    int balance;
    static int count;

    //static 키워드가 붙어있는 변수는
    //객체생성과 상관없이
    //클래스에서 바로 접근해서 사용 가능한 변수
    //정적변수, static 변수, 클래스 변수
    //"클래스명.변수명" 접근해서 사용가능
    //객체마다 공유할 목적으로!
    //객체생성하지 않고 언제든지 접근해서 사용 목적으로!

    int getAvg(){
        return balance;
    }

    public AccountData(String name, String ssn, int balance) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        count++;
    }

    @Override
    public String toString() {
        return "AccountData: " +
                "name='" + name + '\'' +
                ", ssn=" + ssn +
                ", balance=" + balance +
                " ";
    }
}
