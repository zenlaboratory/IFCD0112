package com.zenlaboratory.metodosestaticos;

public class Principal {

	public static void main(String[] args) {
			/* Al declarar el método getContador como Static, ya está instanciado y podemos llamarlo
			 * directamente sin tener que crear un objeto coche
			 * Si el método getContadro no fuera static, no podríamos haceder a él sin crear un obj Coche.
			 * Y la expresión System.out.println(c3.getContador()) daría un error al no tener el obj C3 creado
			 * de esta forma podemos acceder a él a través de la clase Coche.getContador())
			 */
		System.out.println("El contador incluido en getContador de coche vale:"+Coche.getContador());
		
		Coche c1=new Coche();
		Coche c2=new Coche("Renaul","Kangoo");
		Coche c3=new Coche("Citroën", "C3");
			/* Una vez creados los tres objetos coche, contador aumenta a 3 y su valor, al ser una 
			 * variable static, será igual para los tres.
			 */
		System.out.println("El contador del objeto Coche C3 es:"+c3.getContador());
		System.out.println("El contador incluido en Coche.getContador() ahora vale:"+Coche.getContador());
		
			// ****************** Ejeplo de la clase sin método Static **********
		System.out.println("******************* EJEMPLO ÁREA CÍRCULO SIN USAR MÉTOD ESTÁTICO ************");
		CirculoNoEstatico circulo=new CirculoNoEstatico(2);
		System.out.println("El área de un círculo de un radio de "+circulo.getRadio()+" es: "+circulo.area());
		
		// ****************** Ejeplo de la clase CON MÉTODO STATIC (y sin él) **********
		
			// Llamamos al método estático (de clase)
		System.out.println("******************* EJEMPLO ÁREA CÍRCULO USANDO MÉTOD ESTÁTICO ************");
		System.out.println("El área de un círculo de radio de 2 es: "+CirculoEstatico.area(2));
		
			// Creando un objeto 
		CirculoEstatico C=new CirculoEstatico(2);
		System.out.println("******************* EJEMPLO ÁREA CÍRCULO LLAMANDO AL MÉTODO OBJETO O DE INSTANCIA  ************");
		System.out.println("El área de un círculo de radio 2 es: "+C.area());
		
		
	}

}
