package org.example;

import java.util.Scanner;

public class salto_mario {
    public static int [] salto_mario_plus () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de saltos ");
        int numero_saltos = sc.nextInt();
        int altura_saltos [] = new int[numero_saltos];

        //int acumulador_saltos_negativo =0;
        int contador_saltos_positivo=0;
        int contador_saltos_negativo=0;
        for (int i =0; i<numero_saltos; i++){
            System.out.println("introduce la altura de saltos");
            altura_saltos [i] = sc.nextInt();

        }
        int acumulador_saltos=altura_saltos[0];

        for (int i =1; i<numero_saltos; i++){
            if (altura_saltos[i]>acumulador_saltos){
                contador_saltos_positivo++;
            } else if (altura_saltos[i] <acumulador_saltos) {
                contador_saltos_negativo ++;
            }
            acumulador_saltos = altura_saltos[i];

        }

        return new int [] {contador_saltos_positivo,contador_saltos_negativo};
    }


}
