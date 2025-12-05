package org.example;

import java.util.Scanner;

public class numero_reflejado {
    public static int invertir (int numero) {

        String invertido = ""; // esto se crea para ir guardando el numero
        // convertir el numero a string
        String numero_string = Integer.toString(numero);   // lo que hago es convertir la variable de numero a string
        for (int i =numero_string.length()-1; i>=0; i--){
            char c = numero_string.charAt(i);
            invertido = invertido+c;
        }
        int resultado = Integer.parseInt(invertido);
        return resultado;
    }
}
