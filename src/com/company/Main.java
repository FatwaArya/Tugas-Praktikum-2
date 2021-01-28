package com.company;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
    Bola bolaBasket =new Bola();

        System.out.println("Bangun Ruang Bola Basket");
        bolaBasket.setJariJari(21);


        System.out.println("Diameter Bola   = " + bolaBasket.showDiameter() + " cm");
        System.out.println("Luas Permukaan  = " + bolaBasket.showLuasPermukaan() + " cm2");
        System.out.println("Volume Bola     = " + bolaBasket.showVolume() + " cm3");



    }
}
