package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class olivar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** BIENVENIDO AL OLIVOMETRO ***");
        System.out.println("Introduce el tamaño de tu bancal...");
        System.out.println("introducir el ancho del bancal");
        int ancho = sc.nextInt();
        System.out.println("introducir el largo del bancal");
        int largo = sc.nextInt();

        int[][] kilos_oliva = new int[largo][ancho];

        for (int i =0; i<largo; i++){

            while (true) {
                System.out.println("introduce " +ancho+ "valores para la fila" +(i+1)+ "separados por espacios");
                String linea = sc.nextLine();
                String [] partes = linea.split(" "); 
            }
        }
    }
}
