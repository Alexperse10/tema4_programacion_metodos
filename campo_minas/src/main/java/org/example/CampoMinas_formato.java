package org.example;

import java.util.Scanner;

public class CampoMinas_formato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int ancho = sc.nextInt();
            int altura = sc.nextInt();

            if (ancho ==0 || altura ==0) {
                break;
            }

            sc.nextLine(); // Se introduce para limpiar el buffer

            char [][] tablero = new char[altura][ancho];

            for (int i =0; i<altura; i++){
                String linea = sc.nextLine();  // se introduce la fila
                tablero [i] = linea.toCharArray(); //convierto la fila en un array de caracteres

            }
            int contadorceldas = 0;

            for (int fila =0; fila<altura; fila++){
                for (int columna =0; columna <ancho; columna ++){
                    if (tablero[fila][columna] == '-'){
                        int minasalrededor = 0;

                        for (int movifilas =-1; movifilas <=1; movifilas++) {
                            for (int movicolums =-1; movicolums<=1; movicolums++){
                                if (movifilas ==0 && movicolums ==0) {
                                    continue;
                                }

                                int movimientofila = fila +movifilas;
                                int movimientocolumna = columna+movicolums;

                                if (movimientofila>=0 && movimientocolumna<altura && movimientocolumna>=0 && movimientocolumna< ancho) {
                                    if (tablero[movimientofila][movimientocolumna] == '*') {
                                        minasalrededor++;
                                    }
                                }
                            }
                        }
                        if (minasalrededor>=6){
                            contadorceldas++;
                        }
                    }
                }
            }
            System.out.println(contadorceldas);
        }

    }
}
