/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.garajev2;

/**
 *
 * @author Lenovo
 */
public class Principal {
    
    public static void main(String[] args) {

        Garaje garaje = new Garaje();
        
        Vehiculo v1 = new Coche(4,"Coche", "Citroen", "C4", 4);
        Vehiculo v2 = new Coche(5,"Coche", "Seat", "Toledo", 4);
        Vehiculo v3 = new Moto(true,"Moto","Honda", "CBR", 2);
        Vehiculo v4 = new Moto(false, "Moto", "Yamaha", "R1", 2);
        Vehiculo v5 = new Coche(5,"Coche", "Honda", "Civic", 4);
        Vehiculo v6 = new Moto(true, "Moto", "Kawasaki", "ZZR", 2);
               
        garaje.entraVehiculo(v1);
        garaje.entraVehiculo(v2);
        garaje.entraVehiculo(v3);
        garaje.entraVehiculo(v4);
        //garaje.entraVehiculo(v5);
        //garaje.entraVehiculo(v6);
        //garaje.entraVehiculo(v1); // Este vehículo no entraría en el garaje porque está completo.
        
        garaje.listaOcupacion();        
        
    }
    
}
