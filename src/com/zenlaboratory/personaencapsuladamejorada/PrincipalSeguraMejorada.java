package com.zenlaboratory.personaencapsuladamejorada;

public class PrincipalSeguraMejorada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaSeguraMejorada personaSegura1 = new PersonaSeguraMejorada();
		
		personaSegura1.setEdad(80); // No permite asignar cualquier edad
		
		System.out.println(personaSegura1.getEdad());

	}

}
