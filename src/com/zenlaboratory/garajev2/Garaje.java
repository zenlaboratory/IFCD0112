/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.garajev2;

/**
 *
 * @author Lenovo
 */

// Capacidad para 6 vehículos

public class Garaje {
    
    int i = 0;

    // Creamos el array que almacenará los coches del garaje. Máximo de 6 coches
    
    Vehiculo deposito[] = new Vehiculo[6];
    
    // Método de entrada de vehículos (objeto)
    
    public void entraVehiculo(Vehiculo entradaVehiculo) {

        if (i > 5) {

            System.out.println("Las 6 plazas del garaje están ocupadas");
            System.out.println("El vehículo no será aparcado en garaje");
            System.out.println("--------------------------------------");

        } else {

            deposito[i] = entradaVehiculo;
            i++;

        }

    }
    
    // Método de visualización de plazas y sus ocupantes
    
    public void listaOcupacion() {

        for (int i = 0; i < deposito.length; i++) {

            if (deposito[i] == null) {

                System.out.println("La plaza " + i + " está vacía");

            } else {

                System.out.println("La plaza " + i + " está ocupada por un/una " + deposito[i].getTipoVehiculo() + " " + deposito[i].getMarca() + " " + deposito[i].getModelo());

            }

        }

    }

}
