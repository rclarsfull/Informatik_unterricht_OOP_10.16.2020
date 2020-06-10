package com.company;

public class Mensch {
    private String vorName;
    private String nachName;
    private int alter;
    private boolean maennlich;


    Mensch (){};
    Mensch (String vorName, String nachName, int alter, boolean maennlich){
      this.vorName=vorName;
      this.nachName=nachName;
      this.alter=alter;
      this.maennlich=maennlich;
    };

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isMaennlich() {
        return maennlich;
    }

    public boolean isAelter(Mensch m){
        if (m.alter>alter){
            return true;
        }
        return false;
    }

    public String toString(){
        String a= "weiblich";
        if (maennlich){
            a="maennlich";
        }
        return ("Name: "+ vorName+" "+ nachName+ " Alter: "+ alter+ " Geschlecht: "+ a);
    }
}
