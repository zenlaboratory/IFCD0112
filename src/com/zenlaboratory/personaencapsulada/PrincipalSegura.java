package com.zenlaboratory.personaencapsulada;

public class PrincipalSegura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaSegura personaSegura1 = new PersonaSegura();
		
		personaSegura1.setEdad(100); // No permite asignar cualquier edad
		
		System.out.println(personaSegura1.getEdad());

	}

}
