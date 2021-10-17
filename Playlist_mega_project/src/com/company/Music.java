package com.company;

public class Music {
    private String name;
    private double duration;

    @Override
    public String toString() {
        return this.name+" "+this.duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Music(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }
}
