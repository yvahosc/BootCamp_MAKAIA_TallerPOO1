package com.company;

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
    }
}
