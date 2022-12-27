package com.zenlaboratory.variablesestaticas;

public class ejemploMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ejemplo de constante static de Math.PI: "+Math.PI);
		
			// podemos llamar a i sin tener que instanciar la clase A
		System.out.println("****Al ser static no es necesario instanciar la clase**********+");
		System.out.println("El valor de i es: "+ClaseA.i);
		
			// Creamos dos clases A
		ClaseA CA1 =new ClaseA();
		ClaseA CA2=new ClaseA();
		
			// Ahora imprimimos la variable i de la clase CA1 y CA2
		
		System.out.println("Clase CA1.i es: "+CA1.i);
		System.out.println("Clase CA2.i es: "+CA2.i);
		
			// Si cambiamos el valor de i de cualquiera de los objetos de la as clase, se cambia el valor
			// en todas los objetos de la misma clase
		
		CA2.i++;
		CA2.j++;
			// *** Se i cambió en todas las clases de la clase A!! ***
		System.out.println("Clase CA1.i es: "+CA1.i);
		System.out.println("Clase CA2.i es: "+CA2.i);
			// al estar Static, podemos acceder a la variable ClaseA.i directamente sin tener
			// que instaciarla (crear un objeto)
		System.out.println("El valor de i es: "+ClaseA.i);
		
			// Si la variable no es estatica, entonces cada variable j de cada objeto conserva 
			// su valor.
		System.out.println("****SI LA VARIABLE NO ES ESTATICA**********+");
		System.out.println("Clase CA1.j es: "+CA1.j);
		System.out.println("Clase CA2.j es: "+CA2.j);
		
		
			// Si declaramos la variable k como private y static, funciona igual
		System.out.println("*********Declaramos k como privada y statica*****************+");
		System.out.println("La variable k del objeto CA2: "+CA2.getK());
		CA1.setK(1000);
		System.out.println("La variable k del objeto CA2: "+CA2.getK());
		
		
			// Y lo mismo para con las CONSTANTES estáticas de la ClaseA que estarán disponibles
			// para todos los objtetos de la ClaseA
		System.out.println("****CONSTANTE STATIC **********+");
		System.out.println("Clase CA1.NOMBRE es: "+CA1.NOMBRE);
		System.out.println("Clase CA2.NOMBRE es: "+CA2.NOMBRE);

		
		
			// Ejemplo con la clase coche
		System.out.println("*****Contador situado en el constructor*********");
		Coche coche1=new Coche();
		System.out.println("El contador de coche1 vale:"+coche1.contador);
		Coche coche2=new Coche();
		System.out.println("El contador de coche2 vale:"+coche2.contador);
		Coche coche3=new Coche();
		System.out.println("El contador de coche3 vale:"+coche3.contador);
				/* ** EL VALOR DE CONTADOR es IGUAL para coche1.contador.
				 * 
				 * EL VALOR SE CAMBIA PARA TODAS LAS VARIABLES contador de todas la
				 * ClaseA creadas (objetos ClaseA).
				 */
		
		System.out.println("El contador de coche1 vale:"+coche1.contador);
		System.out.println("El contador de coche2 vale:"+coche2.contador);	
		
				/* SI ELIMINAMOS STATIC los valores de contador serían diferentes para cada 
				 * uno de los objetos de la clase ClaseA
				 */
		
	}

}
