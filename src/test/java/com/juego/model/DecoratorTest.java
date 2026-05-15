package com.juego.model;

import com.juego.patrones.decorator.PersonajeConEspada;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    @DisplayName("Decorator debe aplicar bonus de +10 ademas del ataque normal")
    void testEspadaAplicaBonus() {
        Personaje base = new Personaje("Caballero");
        Personaje conEspada = new PersonajeConEspada(base);
        Personaje objetivo = new Personaje("Enemigo");

        int vidaAntes = objetivo.getPuntosDeVida(); // 100
        conEspada.atacar(objetivo);
        int danoTotal = vidaAntes - objetivo.getPuntosDeVida();

        // El ataque base es minimo 10, mas el bonus de 10 = minimo 20 en total
        assertTrue(danoTotal >= 20,
                "Con espada el danio minimo debe ser 20, fue: " + danoTotal);
    }

    @Test
    @DisplayName("Decorator debe conservar el nombre del personaje original")
    void testNombreConservado() {
        Personaje base = new Personaje("Link");
        Personaje decorado = new PersonajeConEspada(base);
        assertEquals("Link", decorado.getNombre());
    }

    @Test
    @DisplayName("Decorator debe conservar los HP del personaje original")
    void testHPConservado() {
        Personaje base = new Personaje("Link");
        Personaje decorado = new PersonajeConEspada(base);
        assertEquals(100, decorado.getPuntosDeVida());
    }
}
