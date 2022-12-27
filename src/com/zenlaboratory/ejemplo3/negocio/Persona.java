/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.ejemplo3.negocio;

/**
 *
 * @author Lenovo
 */
public class Persona {
    
    private String nombre;

    public String getNombre() {
        
        return nombre;
        
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }
    
    // Nuevo método solo visible dentro del paquete
    
    void imprimeTextoAndar() {
        
        System.out.println(getNombre() + " camina a");
        
    }
    
    public void andar() {
        
        imprimeTextoAndar();
        System.out.println(" 5 Km/h");
        
    }
    
}
