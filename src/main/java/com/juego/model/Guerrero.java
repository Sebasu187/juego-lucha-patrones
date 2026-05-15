package com.juego.model;

// Guerrero: ataque fisico fuerte (dano entre 15 y 35)
public class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        int dano = 15 + (int)(Math.random() * 21); // entre 15 y 35
        oponente.recibirDano(dano);
        System.out.println(getNombre() + " [Guerrero] golpea a "
                + oponente.getNombre() + " con su espada causando " + dano + " puntos.");
    }
}
