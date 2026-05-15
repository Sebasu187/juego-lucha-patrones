package com.juego.patrones.decorator;

import com.juego.model.Personaje;

// Decorador concreto: agrega un bonus de +10 de dano por tener espada
public class PersonajeConEspada extends PersonajeDecorador {

    public PersonajeConEspada(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void atacar(Personaje oponente) {
        // Primero hace el ataque normal
        personajeDecorado.atacar(oponente);
        // Luego agrega el bonus de la espada
        int bonusEspada = 10;
        oponente.recibirDano(bonusEspada);
        System.out.println(getNombre() + " causa +" + bonusEspada
                + " puntos extra con su Espada Magica!");
    }
}
