package com.zenlaboratory.parimpar;

public class ParImpar {

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            int resto = i % 2;

            if (resto == 0) {

                System.out.println("El número " + i + " es par.");

            } else {

                System.out.println("El número " + i + " es impar.");

            }

        }

        System.out.println("********** FIN BUCLE FOR **********");

        int i = 1;

        while (i <= 50) {

            int resto = i % 2;

            if (resto == 0) {

                System.out.println("El número " + i + " es par.");

            } else {

                System.out.println("El número " + i + " es impar.");

            }

            i++;

        }

        System.out.println("********** FIN BUCLE WHILE **********");

        int j = 1;

        do {

            int resto = j % 2;

            if (resto == 0) {

                System.out.println("El número " + j + " es par.");

            } else {

                System.out.println("El número " + j + " es impar.");

            }

            j++;

        } while (j <= 50);

        System.out.println("********** FIN BUCLE DO/WHILE **********");

    }

}
