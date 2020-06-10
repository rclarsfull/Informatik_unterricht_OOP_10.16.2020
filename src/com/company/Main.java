package com.company;

public class Main {

    public static void main(String[] args) {
        Mensch test= new Mensch("Lars","Przybylek",20,true);
        System.out.println(test.toString());
        System.out.println(test.isAelter(new Mensch("Pascal","Schlemper",17,true)));
        System.out.println(test);
    }
}
