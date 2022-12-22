package com.zenlaboratory.sobrecargaestatica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro();
		
		libro1.setTitulo("Guerra y Paz");
		libro1.setTotalPaginas(760);
		
		System.out.println("Título del libro: " + libro1.getTitulo());
		System.out.println("Número de páginas: " + libro1.getTotalPaginas());
		System.out.println("");
		System.out.println("******************************");
		System.out.println(libro1.getPaginaActual());
		
		libro1.avanzarPagina();
		libro1.avanzarCapitulo();
		
		System.out.println(libro1.getPaginaActual());
		
		System.out.println(libro1.getPaginaActual());
		
		
				
	}

}
