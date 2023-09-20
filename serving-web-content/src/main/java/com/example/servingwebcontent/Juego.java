package com.example.servingwebcontent;
public class Juego {
    private int numeroAdivinar;
    private int premio;

    public Juego() {
        // Inicializa el juego con un número aleatorio entre 1 y 10 y un premio de $100,000
        numeroAdivinar = (int) (Math.random() * 10) + 1;
        premio = 100000;
    }

    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }

    public int getPremio() {
        return premio;
    }

    public void reducirPremio() {
        premio -= 10000;
    }
}
