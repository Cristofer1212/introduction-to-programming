package com.Part2;

public class SegundaParte {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println(miCoche.NumeroDePuertas);
        System.out.println(miCoche.NumeroDePuertas);
        System.out.println(miCoche.NumeroDePuertas);
        System.out.println(miCoche.NumeroDePuertas);
        System.out.println(miCoche.NumeroDePuertas);
    }
}

class Coche {
    public int NumeroDePuertas = 1;
    public void IncrementarNúmeroDePuertas () {
        this.NumeroDePuertas++;
    }
}
