package org.example;

import java.util.Scanner;

public class vector_calcular_maximo {
    public static int [] leer_vector (int tamaño){
        Scanner sc = new Scanner(System.in);
        int vector [] = new int[tamaño];
        for (int i =0; i<tamaño; i++) {
            System.out.println("introduce el numero "+(i+1)+ " :");
             vector [i] = sc.nextInt();
        }
        return vector;
    }
    public static void mostrar_vector (int [] vector){
        System.out.println("vector ");
        for(int i =0; i< vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println(" ");
    }

    public static int calcular_maximo (int [] vector) {
        int maximo_vector = 0;
        for (int i =0; i<vector.length; i++){
            if (vector[i]>maximo_vector){
                maximo_vector = vector[i];
            }
        }
        return maximo_vector;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el tamaño");
        int tamaño = sc.nextInt();

        int vector [] = leer_vector(tamaño);

         mostrar_vector(vector);

         int resultado  = calcular_maximo(vector);
         System.out.println(" el maximo es: "+resultado);
    }

}
