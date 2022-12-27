/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.ejemplo3_1.main;

import com.zenlaboratory.ejemplo3_1.negocio.Deportista;
import com.zenlaboratory.ejemplo3_1.negocio.Persona;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {

        Persona p1 = new Persona("Manolo");

        p1.andar();

        Deportista d1 = new Deportista("Maria");

        d1.andar();

    }

}
