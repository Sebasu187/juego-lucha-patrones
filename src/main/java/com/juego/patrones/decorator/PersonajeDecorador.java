package com.juego.patrones.decorator;

import com.juego.model.Personaje;

// Clase base del decorador — envuelve a cualquier Personaje
public abstract class PersonajeDecorador extends Personaje {
    protected Personaje personajeDecorado;

    public PersonajeDecorador(Personaje personaje) {
        super(personaje.getNombre());
        this.personajeDecorado = personaje;
    }

    @Override
    public void atacar(Personaje oponente) {
        personajeDecorado.atacar(oponente);
    }
}
