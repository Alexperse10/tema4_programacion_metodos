package org.example;

import java.util.Scanner;

public class ejercicio_7_recursividad_ordenado {
    public static boolean ordenado (String palabra) {
        if (palabra.length()<=1) {
            return true;
        }
        if (palabra.charAt(0)>palabra.charAt(1)){
            return false;
        }
        return ordenado(palabra.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("introduce una palabra");
        palabra = sc.nextLine();

        if (ordenado(palabra)) {
            System.out.println("la palabra esta ordenada alfabeticamente");
        }else {
            System.out.println("la palabra no esta ordenada");
        }
    }
}
