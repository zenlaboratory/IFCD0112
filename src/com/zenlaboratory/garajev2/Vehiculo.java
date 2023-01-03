/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.garajev2;

/**
 *
 * @author Lenovo
 */
public class Vehiculo {
    
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    private int numeroRuedas;

    public Vehiculo(String tipoVehiculo, String marca, String modelo, int numeroRuedas) {
        
        super();
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroRuedas = numeroRuedas;
        
    }

    public String getTipoVehiculo() {
        
        return tipoVehiculo;
        
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        
        this.tipoVehiculo = tipoVehiculo;
        
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

    public int getNumeroRuedas() {
        
        return numeroRuedas;
        
    }

    public void setNumeroRuedas(int numeroRuedas) {
        
        this.numeroRuedas = numeroRuedas;
        
    }
    
    
    
}
