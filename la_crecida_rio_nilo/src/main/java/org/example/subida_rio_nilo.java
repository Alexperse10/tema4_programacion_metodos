package org.example;

import java.util.Random;
import java.util.Scanner;

public class subida_rio_nilo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho;
        int alto; // el alto siempre tiene que ser impar
        System.out.println("**** Subida del rio Nilo ****");
        System.out.println("Introducir el ancho del terreno");
        ancho = sc.nextInt();
        boolean alto_impar = false;
        do {
            System.out.println("introducir el alto de terreno");
            alto = sc.nextInt();
            alto_impar =false;
            if (alto%2==0){
                System.out.println("Error introduce un numero impar");
                alto_impar = true;
            }
        }while (alto_impar);
        int [][] terreno = new int[alto][ancho];
         int numero_aleatorio [][] = new int[alto][ancho];
        Random aleatorio = new Random();
        for (int i =0; i<alto; i++){
            for (int j =0; j<ancho; j++){
                numero_aleatorio [i][j] = aleatorio.nextInt(1000);
            }
        }
        int celda_central = alto/2;
        numero_aleatorio[celda_central][0] =0; // esto de aqui lo he tenido que buscar
        for (int i =0; i<alto; i++){
            for (int j=0; j<ancho; j++){
                    System.out.print(numero_aleatorio[i][j] + " ");
                }
            System.out.println();
            }
        int altura_minima=0;
        int total_celdas = alto * ancho;
        int mitad_celdas = total_celdas/2; 
        for (int i =0; i<alto; i++){
            for (int j =1; j<(ancho/2)+1; j++){
                if (numero_aleatorio[i][j]>altura_minima){
                    numero_aleatorio[i][j] = altura_minima;
                }
            }

        }
        System.out.println("la altura minima para llegar a la mitad del terreno es " +altura_minima);

        }


    }

