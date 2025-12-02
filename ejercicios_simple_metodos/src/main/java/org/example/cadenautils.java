package org.example;

public class cadenautils {
    public static String aMauyusculas (String palabra){
        return palabra.toUpperCase();
    }
    public static int contarvocales (String palabra){
        int contador =0;
        palabra = palabra.toLowerCase();
        for (int i =0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador ++;
            }
        }
        return contador;
    }
}
