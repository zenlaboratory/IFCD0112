package com.zenlaboratory.ejemploconstructormejoradoplus;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Coche coche = new Coche("Citroen", "Saxo");
        Coche coche2 = new Coche("Yaris");
        Coche coche3 = new Coche("Corolla");

        // Coche coche4 = new Coche();
        // Al crear un constructor el por defecto desaparece
        // coche.setMarca("Toyota");
        // coche.setModelo("Yaris");
        System.out.println(coche.getMarca());
        System.out.println(coche.getModelo());

        System.out.println(coche2.getMarca());
        System.out.println(coche2.getModelo());

        System.out.println(coche3.getMarca());
        System.out.println(coche3.getModelo());

    }

}
