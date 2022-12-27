package com.zenlaboratory.metodos;

public class Metodos {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        holas();
        adios();
        holas();

    }

    private static void adios() {
        mensaje("adios", 4);
    }

    private static void holas() {
        mensaje("holas", 4);
    }

    private static void mensaje(String mensaje, int repeticiones) {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(mensaje);
        }

    }

}
