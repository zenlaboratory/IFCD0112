/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.herenciadeportistaoverride_2;

/**
 *
 * @author Lenovo
 */

public class Persona {

    private String nombre;
    
    public Persona(String nombre) {
        
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void andar() {

        System.out.println(getNombre() + " camina a 5 Km/h");

    }

}
