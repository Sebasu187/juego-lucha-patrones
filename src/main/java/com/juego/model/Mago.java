package com.juego.model;

// Mago: ataque magico (dano entre 10 y 40, mas variado)
public class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = 10 + (int)(Math.random() * 31); // entre 10 y 40
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " [Mago] lanza un hechizo a "
                + oponente.getNombre() + " causando " + dano + " puntos magicos.");
    }
}
