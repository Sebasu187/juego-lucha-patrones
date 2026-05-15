package com.juego.patrones.factory;

import com.juego.model.Personaje;
import com.juego.model.Guerrero;
import com.juego.model.Mago;

// La "fabrica" que crea personajes segun el tipo solicitado
public class PersonajeFactory {

    // Le pides un tipo ("guerrero" o "mago") y un nombre, y te devuelve el personaje
    public static Personaje crearPersonaje(String tipo, String nombre) {
        switch (tipo.toLowerCase()) {
            case "guerrero":
                return new Guerrero(nombre);
            case "mago":
                return new Mago(nombre);
            default:
                // Si no reconoce el tipo, crea un personaje basico
                return new Personaje(nombre);
        }
    }
}
