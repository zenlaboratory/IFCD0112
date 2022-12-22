package com.zenlaboratory.ejemploconstructormejoradoplusplus;

public class Coche {
	
	private String marca;
	private String modelo;
	
	// Nuevo constructor por defecto
	public Coche() {
		
		this.marca = "Toyota";
		this.modelo = "Yaris";
	}
	
	// Constructor añadido
	public Coche(String modelo) {
		this.marca = "Citroen";
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
			
}

