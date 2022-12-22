package com.zenlaboratory.personasinencapsular;

public class PrincipalInsegura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaInsegura personainsegura1 = new PersonaInsegura();
		
		personainsegura1.edad = 1000; // No existe ningún control
		
		System.out.println(personainsegura1.edad);

	}

}
