/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.proyectogaraje;

/**
 *
 * @author zenlaboratory
 */
public class Principal {

    public static void main(String[] args) {

        Garaje garaje = new Garaje();
        Coche coche1 = new Coche("Ferrari", "Testarossa");
        Coche coche2 = new Coche("C4");
        Coche coche3 = new Coche("Lamborghini", "Diabolo");

        /* Visualización de los datos introducidos
        
        System.out.println(coche1.getMarca());
        System.out.println(coche1.getModelo());
        System.out.println(coche2.getMarca());
        System.out.println(coche2.getModelo());
        System.out.println(coche3.getMarca());
        System.out.println(coche3.getModelo());
        
         */
        // Introducción de coches en garaje
        garaje.entraCoche(coche1);
        garaje.entraCoche(coche2);
        //garaje.entraCoche(coche3);
        //garaje.entraCoche(coche1);

        // Visualización del estado del garaje coches / plazas libres
        garaje.listaOcupacion();

    }

}
