/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.ejemplo3.main;

import com.zenlaboratory.ejemplo3.negocio.Deportista;
import com.zenlaboratory.ejemplo3.negocio.Persona;

/**
 *
 * @author Lenovo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        
        p1.setNombre("Manolo");
        p1.andar();
        
        Deportista d1 = new Deportista();
        
        d1.setNombre("María");
        d1.andar();
        
    }
    
}
