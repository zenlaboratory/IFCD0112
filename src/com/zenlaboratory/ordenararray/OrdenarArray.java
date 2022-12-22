package com.zenlaboratory.ordenararray;

public class OrdenarArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] listaNumeros = new int[] {34, 25, 49, 14, 20};
		
		for (int i = 0; i < listaNumeros.length; i++) { 
			
			for (int j = i + 1; j < listaNumeros.length; j++) {  
		
				int tmp = 0;  
		
				if (listaNumeros[i] > listaNumeros[j]) {  
		
					tmp = listaNumeros[i];  
					listaNumeros[i] = listaNumeros[j];  
					listaNumeros[j] = tmp;
				
				} 
			
			}  
		
		System.out.println(listaNumeros[i]);
		
		}  
		
	}  
		  
}


