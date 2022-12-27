package com.zenlaboratory.ejemploconstructormejorado;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Coche coche = new Coche("Citroen", "Saxo");

        // coche.setMarca("Toyota");
        // coche.setModelo("Yaris");
        System.out.println(coche.getMarca());
        System.out.println(coche.getModelo());

    }

}
