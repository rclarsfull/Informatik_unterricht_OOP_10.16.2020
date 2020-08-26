package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. ");
        System.out.println();


        Mensch test= new Mensch("Lars","Przybylek",20,true);
        System.out.println(test.toString());
        System.out.println(test.isAelter(new Mensch("Pascal","Schlemper",17,true)));
        System.out.println(test);

        System.out.println();
        System.out.println();
        System.out.println("2.");
        System.out.println();


        Artikel artikel1=new Artikel();
        artikel1.setBezeichnung("Maus");
        artikel1.setArtikelNummer("M001");
        artikel1.setEkPreis(20.00);
        artikel1.setLagerBestand(5);
        Artikel artikel2=new Artikel("Tastatur","T001",20.00,7);
        Artikel artikel3=new Artikel("CPU","C001",90.00,3);


        System.out.println(artikel1);
        System.out.println(artikel2);
        System.out.println(artikel3);


        Artikel[] artikelArray={
                new Artikel("Tastatur","T001",20.00,7),
                new Artikel("Tastatur","T004",200.00,4),
                new Artikel("Tastatur","T002",10.00,45),
        };

        System.out.println();

        for (Artikel a:artikelArray) {
            System.out.println(a);
        }

    }


}
