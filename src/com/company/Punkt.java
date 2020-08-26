package com.company;

public class Punkt {
    private double x,y;

    Punkt(){};
    Punkt(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void read(double x, double y){
        this.x=x;
        this.y=y;
    }
}
