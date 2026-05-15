package com.juego.model;

import com.juego.patrones.factory.PersonajeFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PersonajeFactoryTest {

    @Test
    @DisplayName("Factory debe crear un Guerrero")
    void testCrearGuerrero() {
        Personaje p = PersonajeFactory.crearPersonaje("guerrero", "Aragorn");
        assertNotNull(p);
        assertEquals("Aragorn", p.getNombre());
        assertTrue(p instanceof Guerrero);
    }

    @Test
    @DisplayName("Factory debe crear un Mago")
    void testCrearMago() {
        Personaje p = PersonajeFactory.crearPersonaje("mago", "Gandalf");
        assertNotNull(p);
        assertEquals("Gandalf", p.getNombre());
        assertTrue(p instanceof Mago);
    }

    @Test
    @DisplayName("Factory debe crear Personaje basico si el tipo no existe")
    void testCrearTipoDesconocido() {
        Personaje p = PersonajeFactory.crearPersonaje("desconocido", "Misterio");
        assertNotNull(p);
        assertEquals("Misterio", p.getNombre());
    }

    @Test
    @DisplayName("Guerrero creado por Factory debe tener 100 HP")
    void testGuerreroTiene100HP() {
        Personaje p = PersonajeFactory.crearPersonaje("guerrero", "Conan");
        assertEquals(100, p.getPuntosDeVida());
    }
}
