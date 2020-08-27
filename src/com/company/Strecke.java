package com.company;
import java.lang.Math;


public class Strecke {
    Punkt p,q;

    Strecke(){}
    Strecke(Punkt p,Punkt q){
        this.p=p;
        this.q=q;
    }

    public void read(double p1,double p2, double q1,double q2){
        this.q.read(q1,q2);
        this.p.read(p1,p2);
    }

    public double getLaenge(){
        double diffX= this.p.getX()-this.q.getX();
        double diffY= this.p.getY()-this.q.getY();
    return (Math.sqrt(Math.pow((diffX),2)+Math.pow((diffY),2)));
    }
}
