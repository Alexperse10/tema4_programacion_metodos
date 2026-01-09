package org.example;

import java.util.Scanner;

public class calcula_suma_vectores {
    public static int [] leer_vector (int tamaño) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[tamaño];
        for (int i =0; i< tamaño; i++){
            System.out.println("Introduce el valor "+(i+1) +" :");
            vector[i] = sc.nextInt();
        }
        return vector;

    }
    public static void mostrar_vector(int [] vector){
        System.out.println("vector: ");
        for (int i =0; i< vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    public static int sumar_vector (int [] vector) {
        int suma =0;
        for (int i = 0; i < vector.length; i++) {
        suma += vector[i];
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el tamaño del vector");
        int tamaño = sc.nextInt();

        int vector [] = leer_vector(tamaño);

        mostrar_vector(vector);

        int resultado = sumar_vector(vector);

        System.out.println("la suma del vector es: "+resultado);
    }



}
