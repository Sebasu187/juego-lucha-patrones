package com.juego.model;

import java.util.Random;

// Clase base que representa cualquier personaje del juego
public class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;
    private Random rand;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.rand = new Random();
    }

    // Ataca a otro personaje con daño aleatorio entre 10 y 30
    public void atacar(Personaje oponente) {
        int dano = rand.nextInt(MAX_DANO - MIN_DANO + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre()
                + " causando " + dano + " puntos de danio.");
    }

    public void recibirDano(int dano) {
        if (dano < 0) return;
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    public boolean estaVivo() { return this.puntosDeVida > 0; }
    public String getNombre() { return this.nombre; }
    public int getPuntosDeVida() { return this.puntosDeVida; }
}
