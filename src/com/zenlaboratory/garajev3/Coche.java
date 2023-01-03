/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.garajev3;

/**
 *
 * @author Lenovo
 */
public class Coche extends Vehiculo {
    
    private int numeroPuertas;

    public Coche(int numeroPuertas, String tipoVehiculo, String marca, String modelo, int numeroRuedas) {
        
        super(tipoVehiculo, marca, modelo, numeroRuedas);
        this.numeroPuertas = numeroPuertas;
        
    }

    public int getNumeroPuertas() {
        
        return numeroPuertas;
        
    }

    public void setNumeroPuertas(int numeroPuertas) {
        
        this.numeroPuertas = numeroPuertas;
        
    }
    
}
