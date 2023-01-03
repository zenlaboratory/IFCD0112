/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.herenciadeportistaoverride_2;

import com.zenlaboratory.herenciadeportistaoverride_3.Persona;
import com.zenlaboratory.herenciadeportistaoverride_3.Ingeniero;
import com.zenlaboratory.herenciadeportistaoverride_3.Deportista;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {

        Persona p1 = new Deportista("Manolo");
        Persona p2 = new Ingeniero("Elisa");
        Deportista d1 = new Deportista("Luis");
        
        iniciarCaminoPersona(d1);
        
        //iniciarCaminoPersona(p2);
        //iniciarCaminoPersona(p1);
        
        
//p1.andar();

        /*persona.setNombre("Manolo");
        persona.andar();

        Deportista deportista = new Deportista();

        deportista.setNombre("Omar");
        deportista.andar();

        // System.out.println("Nombre deportista " + deportista.getNombre());
        // System.out.println("Tipo deporte " + deportista.getDeporte()); */
    }
    
    public static void iniciarCaminoPersona(Deportista d) {
        
        d.andar();
        
    }
    
    public static void iniciarCaminoPersona(Ingeniero i) {
        
        i.andar();
        
    }
    

}
