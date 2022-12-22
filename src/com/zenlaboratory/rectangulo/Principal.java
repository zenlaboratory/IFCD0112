package com.zenlaboratory.rectangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.lado1 = 2;
		rectangulo1.lado2 = 3;
		System.out.println(rectangulo1.lado1);
		System.out.println(rectangulo1.lado2);
		
		Rectangulo rectangulo2 = new Rectangulo();
		rectangulo2.lado1 = 4;
		rectangulo2.lado2 = 5;
		System.out.println(rectangulo2.lado1);
		System.out.println(rectangulo2.lado2);
		
		System.out.println("El area del rectangulo1 es: " + rectangulo1.area());
		System.out.println("El perímetro del rectangulo2 es: " + rectangulo2.perimetro());

	}

}
