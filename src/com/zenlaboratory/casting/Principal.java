/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.casting;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {
        
        Persona p1 = new Deportista("Manolo", "Atletismo");
        
        System.out.println(p1.getNombre());
        
        p1.andar();
        
        Deportista d = (Deportista) p1;
        
        System.out.println(d.getDeporte());
        
    }
    
    public static void iniciarCaminoPersona(Deportista d) {
        
        d.andar();
        
    }
    
    public static void iniciarCaminoPersona(Ingeniero i) {
        
        i.andar();
        
    }
    

}
