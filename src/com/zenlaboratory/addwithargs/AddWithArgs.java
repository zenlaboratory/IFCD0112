package com.zenlaboratory.addwithargs;

public class AddWithArgs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int suma = (Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        System.out.println("La suma de " + args[0] + " y " + args[1] + " es: " + suma);

    }

}
