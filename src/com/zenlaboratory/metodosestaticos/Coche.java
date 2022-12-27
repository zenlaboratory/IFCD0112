package com.zenlaboratory.metodosestaticos;

public class Coche {

    private String marca;
    private String modelo;
    // Para hacer un método static el argumento/variable debe debe ser static
    private static int contador;
    // Creamos un constructor delegado

    public Coche() {
        this("Toyota", "Yaris");
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.marca = modelo;
        contador++;
    }
    // CREAMOS UN MÉTODO STATIC QUE DEVUELVE LA VARIABLE CONTADOR.

    public static int getContador() {
        return contador;
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
