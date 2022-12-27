package com.zenlaboratory.delegaciondeconstructores;

public class Coche {

    private String marca;
    private String modelo;

    // Nuevo constructor por defecto
    public Coche() {

        // Delegacion de constructores
        this("Toyota", "Yaris");

    }

    // Constructor añadido
    public Coche(String marca, String modelo) {

        this.marca = marca;
        this.modelo = modelo;

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

}
