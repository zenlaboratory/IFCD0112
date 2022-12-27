/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.ejemplo3.negocio;

/**
 *
 * @author Lenovo
 */
public class Deportista extends Persona {
    
    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    @Override // Anotación
    
    public void andar() {
        
        super.imprimeTextoAndar();
        System.out.println(" 15 Km/h");
        
    }
    
}
