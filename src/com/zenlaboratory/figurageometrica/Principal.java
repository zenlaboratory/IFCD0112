/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.figurageometrica;

/**
 *
 * @author Lenovo
 */
public class Principal {

    public static void main(String[] args) {

        Circulo c = new Circulo(2);
        Rectangulo r = new Rectangulo(4, 7);
        c.setColor("Rojo");
        r.setColor("Verde");
        System.out.println("El círculo es de color " + c.getColor());
        System.out.println("Área del círculo " + c.area());
        System.out.println("El rectángulo es de color " + r.getColor());
        System.out.println("Área del rectángulo " + r.area());

    }

}
