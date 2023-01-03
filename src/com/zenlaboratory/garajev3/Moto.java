/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.garajev3;

/**
 *
 * @author Lenovo
 */
public class Moto extends Vehiculo {
    
    private boolean pasajeros;

    public Moto(boolean pasajeros, String tipoVehiculo, String marca, String modelo, int numeroRuedas) {
        
        super(tipoVehiculo, marca, modelo, numeroRuedas);
        this.pasajeros = pasajeros;
        
    }

    public boolean isPasajeros() {
        
        return pasajeros;
        
    }

    public void setPasajeros(boolean pasajeros) {
        
        this.pasajeros = pasajeros;
        
    }
    
    
    
}
