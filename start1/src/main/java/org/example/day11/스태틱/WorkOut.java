package org.example.day11.스태틱;

public class WorkOut {
    String name;
    String co;
    int time;
    static int count;
    private static int sum;


    public WorkOut(String name, String co, int time) {
        this.name = name;
        this.co = co;
        this.time = time;
        count++;
        sum = sum + time;
    }

    public int getTime() {
        return sum;
    }

    @Override
    public String toString() {
        return "WorkOut{" +
                "name='" + name + '\'' +
                ", co='" + co + '\'' +
                ", time=" + time +
                '}';
    }
}
