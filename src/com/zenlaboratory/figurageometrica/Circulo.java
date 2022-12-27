/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.figurageometrica;

/**
 *
 * @author Lenovo
 */
public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double r) {

        super();
        radio = r;
    }

    public double area() {
        return 3.14 * radio * radio;
    }

    public double perimetro() {
        return 2 * 3.14 * radio;
    }

}
