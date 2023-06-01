package com.company;

public class Carro {
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    public Carro(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void acelerar(){
        System.out.println("El carro está acelerando.");
    }

    public void frenar(){
        System.out.println("El carro está frenando.");
    }

    public void girar(String direccion){
        System.out.println("El carro está girando hacia la: " + direccion +
                ".");
    }

    public void mostrarInformacion(){
        System.out.println("Objeto de la clase Carro, con marca: " + getMarca() +
                "; modelo: " + getModelo() + "; año: " + getAnio() + "; y color: "
                + getColor() + ".");
    }
}
