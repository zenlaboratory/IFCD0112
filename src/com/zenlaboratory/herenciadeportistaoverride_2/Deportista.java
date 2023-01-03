/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.herenciadeportistaoverride_2;

import com.zenlaboratory.herenciadeportistaoverride_3.Persona;

/**
 *
 * @author Lenovo
 */
public class Deportista extends Persona {

    private String deporte;
    
    public Deportista(String nombre) {
        
        super(nombre);
        
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Anotación
    @Override

    public void andar() {

        System.out.println(getNombre() + " camina a 15 Km/h");

    }

}
