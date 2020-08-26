package com.company;

public class Artikel {
    private String bezeichnung,artikelNummer;
    private int lagerBestand;
    private double ekPreis;

    Artikel(){};
    Artikel(String bezeichnung,String artikelNummer,double ekPreis,int lagerBestand){
        this.artikelNummer=artikelNummer;
        this.bezeichnung=bezeichnung;
        this.lagerBestand=lagerBestand;
        this.ekPreis=ekPreis;
    }

    public double getEkPreis() {
        return ekPreis;
    }

    public int getLagerBestand() {
        return lagerBestand;

    }

    public String getArtikelNummer() {
        return artikelNummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setLagerBestand(int lagerBestand) {
        this.lagerBestand = lagerBestand;
    }

    public void setArtikelNummer(String artikelNummer) {
        this.artikelNummer = artikelNummer;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setEkPreis(double ekPreis) {
        this.ekPreis = ekPreis;
    }
    public String toString(){
        return "ArtikelNr: "+artikelNummer+", "+bezeichnung+", Preis: "+ekPreis+", L-Bestand: "+lagerBestand;
    }
}

