/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zenlaboratory.figurageometrica;

/**
 *
 * @author Lenovo
 */
public class Rectangulo extends FiguraGeometrica {

    private double base, altura;

    public Rectangulo(double b, double h) {
        super();
        base = b;
        altura = h;
    }

    public double area() {
        return base * altura;
    }

    public double perimetro() {
        return 2 * (base + altura);
    }

}
