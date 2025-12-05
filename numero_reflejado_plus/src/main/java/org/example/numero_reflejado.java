package org.example;

public class numero_reflejado {
    public static int numero_reflex (int numero){
            String numero_invertido = "";
            String numero_string = Integer.toString(numero);
            for (int i =numero_string.length()-1; i>=0; i--){
                char c = numero_string.charAt(i);
                numero_invertido = numero_invertido+c;
            }
            int resultado = Integer.parseInt(numero_invertido);
            return resultado;
    }
}
