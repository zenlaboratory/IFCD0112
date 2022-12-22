package com.zenlaboratory.ejemploconstructormejoradoplusplus;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche coche = new Coche();
		Coche coche2 = new Coche("C5");
		
		System.out.println(coche.getMarca());
		System.out.println(coche.getModelo());
		System.out.println("");
		System.out.println(coche2.getMarca());
		System.out.println(coche2.getModelo());

	}

}
