package com.zenlaboratory.proyectogaraje;

/**
 *
 * @author zenlaboratory
 */

public class Garaje {
    
    int i = 0;
    
    // Creamos el array que almacenará los coches del garaje. Máximo de 3 coches
    
    Coche[] deposito = new Coche[3];
   
     // Método de entrada de coches (objeto)
    
    public void entraCoche(Coche entradaCoche) {
        
        if (i > 2) {
            
            System.out.println("Las 3 plazas del garaje están ocupadas");
            
        } else {
            
            deposito[i] = entradaCoche;
            i++;
            
        }
        
        
    }
    
    // Método de visualización de plazas y sus ocupantes

    public void listaOcupacion() {
        
        for (int  i = 0; i < deposito.length; i++) {
            
            if (deposito[i] == null) {
                
                System.out.println("La plaza " + i + " está vacía");
                
            } else {
        
            System.out.println("La plaza " + i + " está ocupada por el coche " + deposito[i].getMarca() + " " + deposito[i].getModelo());
            
            }
        
        }
        
    }
    
}
