/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.herenciadeportistaoverride;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Manolo");
        persona.andar();

        Deportista deportista = new Deportista();

        deportista.setNombre("Omar");
        deportista.andar();

        // System.out.println("Nombre deportista " + deportista.getNombre());
        // System.out.println("Tipo deporte " + deportista.getDeporte());
    }

}
