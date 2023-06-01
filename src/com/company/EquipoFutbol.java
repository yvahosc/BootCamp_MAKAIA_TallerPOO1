package com.company;


import java.util.ArrayList;

public class EquipoFutbol {
    private String nombre;
    private String ciudad;
    private ArrayList<Jugador> jugadores;

    public EquipoFutbol(String nombre, String ciudad, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public void mostrarInformacion(){
        System.out.print("Objeto de la clase EquipoFutbol, con nombre: " +
                getNombre() + "; ciudad: " + getCiudad() + "; y jugadores: ");
        for (int i = 0; i < jugadores.size(); i++) {
            if(jugadores.size() - 1 == i){
                System.out.print("y " +getJugadores().get(i).getNombre() + " " +
                        getJugadores().get(i).getApellido() + ".\n");
            }else if(jugadores.size() - 2 == i){
                System.out.print(getJugadores().get(i).getNombre() + " " +
                        getJugadores().get(i).getApellido() + " ");
            }
            else{
                System.out.print(getJugadores().get(i).getNombre() + " " +
                        getJugadores().get(i).getApellido() + ", ");
            }
        }
    }
}
