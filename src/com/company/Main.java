package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    //Implementación clase Carro

        //Creación primer objeto e implementación de sus métodos.
        Carro carro1 = new Carro("Chevrolet", "Onix", 2023,
                "Blanco");

        System.out.println("\nCarro 1:");
        carro1.acelerar();
        carro1.frenar();
        carro1.girar("derecha");
        carro1.mostrarInformacion();

        //Creación segundo objeto e implementación de sus métodos.
        Carro carro2 = new Carro("Ford", "Fiesta", 2023,
                "Negro");

        System.out.println("\nCarro 2:");
        carro2.acelerar();
        carro2.frenar();
        carro2.girar("izquierda");
        carro2.mostrarInformacion();

        //Implementación clase EquipoFutbol

        //Creación de objetos de la clase Jugador y lista de jugadores.
        Jugador jugador1 = new Jugador("Jaime", "Vardy");
        Jugador jugador2 = new Jugador("James", "Maddison");
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        //Creación objeto de la clase EquipoFutbol e implementación de sus
        // métodos.
        EquipoFutbol equipo1 = new EquipoFutbol("Leicester City FC",
                "Leicester", jugadores);

        System.out.println("\nEquipo 1:");
        equipo1.mostrarInformacion();

        //Creación de otros objetos de la clase Jugadores para agregarlos al
        // equipo.
        Jugador jugador3 = new Jugador("Kelechi", "Iheanacho");
        Jugador jugador4 = new Jugador("Marc", "Albrighton");
        equipo1.agregarJugador(jugador3);
        equipo1.agregarJugador(jugador4);


        System.out.println("\nEquipo 1 después de agregar más jugadores:");
        equipo1.mostrarInformacion();
    }
}
