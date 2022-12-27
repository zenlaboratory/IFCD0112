package com.zenlaboratory.metodosestaticos;

public class CirculoNoEstatico {
	private double radio;
	public CirculoNoEstatico (double radio) {
		super();
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
	public double area() {
		// return 2*Math.PI*radio; esto es el perímetro para 2 es igual, pues 
		// 2 al cuadrado (4) es igual a 2*2
		return Math.PI*(radio*radio);
	}
}
