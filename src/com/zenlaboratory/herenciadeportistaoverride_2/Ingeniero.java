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

public class Ingeniero extends Persona {
    
    public Ingeniero(String nombre) {
        
        super(nombre);
        
    }
    
    @Override
    
    public void andar() {
        
        System.out.println(getNombre() + " camina a 3 Km/h");
        
    }
   
    
}
