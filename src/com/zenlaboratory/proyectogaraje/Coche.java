package com.zenlaboratory.proyectogaraje;

/**
 *
 * @author zenlaboratory
 */
public class Coche {

    private String marca;
    private String modelo;

    // Constructor principal
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Constructor delegado
    public Coche(String modelo) {
        this.marca = "Citroen";
        this.modelo = modelo;
    }

    // Setters and Getters de los atributos
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
