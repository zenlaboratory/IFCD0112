package com.zenlaboratory.metodosestaticos;

public class CirculoEstatico {
	private double radio;
	public CirculoEstatico (double radio) {
		super();
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
		// MÉTODO DE INSTANCIA (no es de clase)
	public double area() {
		
			// Aquí llamamos a la clase area statica desde el método area (está sobrecargado)
			// Si area(double radio) no fuese estatico podríamos llamarlo como 
			// this.area(this.radio), pero sólo dentro de la clase. desde fuera de la
			// clase sería (sin ser estático) CirculoEstatico.area(..);
		return CirculoEstatico.area(this.radio); // En este método llamamos al método area de esta clase
	}
		// MÉTODO DE CLASE
	public static double area(double radio) {
		// return 2*Math.PI*radio; Esto es el diámetro (circunferencia)
		return Math.PI*(radio*radio);
	}
}
