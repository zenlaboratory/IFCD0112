package com.zenlaboratory.personaencapsulada;

public class PersonaSegura {
	
	// Solo se permite el acceso desde la propia clase
	private String nombre;
	private int edad;
	
	// Lectura de dato edad
	public int getEdad() {
		return edad;
	}
	
	// Lectura de dato nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int nuevaEdad) {
		if (nuevaEdad > 120) { // Acceso limitado y controlado
			edad = 120;
		} else {
			edad = nuevaEdad;
		}
	}

}
