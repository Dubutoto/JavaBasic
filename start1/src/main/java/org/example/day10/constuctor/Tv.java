package org.example.day10.constuctor;

public class Tv {
    int channel;
    int volume;
    boolean isOn;

    Tv(int channel, int volume, boolean isOn) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = isOn;
    }

    public String toString() {
        return "TV: " +
                "channel=" + channel +
                ", volume=" + volume +
                ", isOn=" + isOn +
                " ";
    }
}
