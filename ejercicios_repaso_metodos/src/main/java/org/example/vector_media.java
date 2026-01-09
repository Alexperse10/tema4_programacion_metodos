package org.example;

import java.util.Scanner;

public class vector_media {
    public static int [] leer_vector (int tamaño){
        Scanner sc = new Scanner(System.in);
        int vector [] = new int[tamaño];
        for (int i =0; i<tamaño; i++){
            System.out.println("introduce el numero "+(1+i) +" :");
            vector [i] = sc.nextInt();
        }
        return vector;
    }

    public static void mostrar_vector (int [] vector){
        Scanner sc = new Scanner(System.in);
        for (int i =0; i< vector.length; i++){
            System.out.println(vector[i] + " ");
        }
        System.out.print(" ");

    }

    public static int calcular_media (int [] vector) {
        Scanner sc = new Scanner(System.in);
        int suma =0;
        for (int i =0; i< vector.length; i++){
            suma += vector[i];
        }

        return suma/ vector.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un tamaño");
        int tamaño = sc.nextInt();

        int vector [] = leer_vector(tamaño);
        mostrar_vector(vector);
        int resultado_total = calcular_media(vector);

        System.out.println("el resultado es: "+resultado_total);
    }

}
