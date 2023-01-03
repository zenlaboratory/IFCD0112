/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.ejemploenum;

/**
 *
 * @author Lenovo
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Propulsion propulsion1 = Propulsion.GLP;
        Propulsion propulsion2 = Propulsion.VIENTO;
        Propulsion propulsion3 = Propulsion.GLP;
        
        System.out.println(propulsion1.name());
        System.out.println(propulsion1.ordinal());
        System.out.println(propulsion1.toString());
        System.out.println(propulsion1.compareTo(propulsion2));
        System.out.println(propulsion1.compareTo(propulsion3));
        System.out.println(propulsion1.equals(propulsion2));
        System.out.println(propulsion1.equals(propulsion3));
        
        
    }
    
}
