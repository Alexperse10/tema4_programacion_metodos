package org.example;

import java.util.Scanner;

public class ejercicio_metodo_10numerospositivos {
    public static int[] dieznumeros() {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[10];
        int contador = 0;
        for (int i = 0; i < numero.length; i++) {
            System.out.println("introduce el numero de la posicion " + (i + 1));
            int numero_usuario = sc.nextInt();
            if (numero_usuario >= 0) {
                numero[contador] = numero_usuario;
                contador++;
            }
        }
        int[] positivos = new int[contador];
        for (int i = 0; i < contador; i++) {
            positivos[i] = numero[i];
        }
        return positivos;
    }
}
