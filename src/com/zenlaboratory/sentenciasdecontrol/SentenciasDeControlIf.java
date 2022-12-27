package com.zenlaboratory.sentenciasdecontrol;

import java.util.Scanner;

public class SentenciasDeControlIf {

    public static void main(String[] args) {

        int numero = 0;

        Scanner leerTeclado = new Scanner(System.in);

        System.out.print("Introduce tu nota: ");

        numero = leerTeclado.nextInt();

        if (numero == 5) {

            System.out.println("Estás aprobado");

        } else if (numero == 5) {

            System.out.println("Has aprobado muy justo");

        } else if (numero < 2) {

            System.out.println("Has suspendido de forma estrepitosa");

        } else if (numero >= 5 && numero < 7) {

            System.out.println("Has sacado un bien");

        } else if (numero >= 7 && numero <= 8) {

            System.out.println("Has sacado un notable");

        } else if (numero == 9) {

            System.out.println("Has sacado un sobresaliente");

        } else if (numero == 10) {

            System.out.println("Excelente!! Estás en el extremo de la nota");

        } else {

            System.out.println("Has suspendido");
        }

    }

}
