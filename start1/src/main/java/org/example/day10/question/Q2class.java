package org.example.day10.question;

public class Q2class {
    String task;
    int time;
    String location;
    static int totalTime = 0;
    static int taskCount = 0;

    public Q2class(String task, int time, String location) {
        this.task = task;
        this.time = time;
        this.location = location;
        totalTime += time;
        taskCount++;
    }

    public static int getTotalTime() {
        return totalTime;
    }

    public static double getAvgTime() {
        return (double) totalTime / taskCount;
    }

    public String toString() {
        return "Q2class: " +
                "task='" + task + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                " ";
    }
}
