package com.company;

public class Bola {
    private double jarijari;
    private double Diameter;
    private double luasPermukaan;
    private double volume;
    private static final double PI= 3.14;


    public void setJariJari(double jarijari) {
        this.jarijari = jarijari;
    }
    public double showDiameter() {
        return jarijari*2;
    }
    public double showLuasPermukaan() {
        return 4/3*PI*jarijari*jarijari;
    }
    public double showVolume() {
        return  4/3*PI*jarijari*jarijari*jarijari;
    }






}
