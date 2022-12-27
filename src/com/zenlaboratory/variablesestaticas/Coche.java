package com.zenlaboratory.variablesestaticas;

public class Coche {

    public static int contador;
    private String marca;
    private String modelo;
    // Creamos un constructor

    public Coche() {
        contador++;
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
