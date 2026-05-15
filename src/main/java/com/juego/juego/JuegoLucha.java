package com.juego.juego;

import com.juego.model.Personaje;
import com.juego.patrones.factory.PersonajeFactory;
import com.juego.patrones.decorator.PersonajeConEspada;
import java.util.Scanner;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje p1, Personaje p2) {
        this.jugador1 = p1;
        this.jugador2 = p2;
    }

    public void iniciarPelea() {
        System.out.println("\n=== LA PELEA COMIENZA ===");
        System.out.println(jugador1.getNombre() + " VS " + jugador2.getNombre());
        System.out.println("========================\n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        System.out.println("\n=== RESULTADO ===");
        if (jugador1.estaVivo()) {
            System.out.println("🏆 " + jugador1.getNombre() + " ha ganado la pelea!");
        } else {
            System.out.println("🏆 " + jugador2.getNombre() + " ha ganado la pelea!");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("\nTurno de " + atacante.getNombre()
                + " (HP: " + atacante.getPuntosDeVida() + ")"
                + " vs " + defensor.getNombre()
                + " (HP: " + defensor.getPuntosDeVida() + ")");
        atacante.atacar(defensor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== JUEGO DE LUCHA ===");
        System.out.print("Tipo del jugador 1 (guerrero/mago): ");
        String tipo1 = scanner.nextLine();
        System.out.print("Nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Tipo del jugador 2 (guerrero/mago): ");
        String tipo2 = scanner.nextLine();
        System.out.print("Nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        // Usamos la FACTORY para crear los personajes
        Personaje p1 = PersonajeFactory.crearPersonaje(tipo1, nombre1);
        Personaje p2 = PersonajeFactory.crearPersonaje(tipo2, nombre2);

        // Usamos el DECORATOR para darle espada al jugador 1
        p1 = new PersonajeConEspada(p1);
        System.out.println("\n" + p1.getNombre() + " equipa una Espada Magica!");

        JuegoLucha juego = new JuegoLucha(p1, p2);
        juego.iniciarPelea();
    }
}
