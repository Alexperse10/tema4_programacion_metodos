package org.example;

import java.util.Scanner;

/**
 * Programa para la resolucion del problema del campo de minas
 * @author Alejandro Pérez
 * El programa consiste en contar cuantas celdas libres tienen al menos 6 minas alrededor
 */

public class CampoMinasModular {

    /**
     *
     * @param sc Scanner que lee los datos de la entrada
     * @param altura numero de filas del tablero
     * @param ancho número de columnas del tablero
     * @return tablero lleno de caracteres que representan el tablero.
     */

    public static char[][] leerTablero(Scanner sc, int altura, int ancho) {
        char[][] tablero = new char[altura][ancho];
        String linea;

        for (int i = 0; i < altura; i++) {
            do {
                System.out.println("introduce la fila: " + (i + 1));
                linea = sc.nextLine();

                if (linea.length() != ancho) {
                    System.out.println("Error la fila debe de tener " + ancho + " caracteres");
                }

            } while (linea.length() != ancho);


            tablero[i] = linea.toCharArray();
        }

        return tablero;
    }

    /**
     *
     * @param tablero es la matriz que muestra el tablero completo
     * @param altura numero de filas del tablero
     * @param ancho numero de columnas del tablero
     * @return numero de celdas que cumplen la condicion de estar rodeadas de 6 minas
     */

    public static int contarCeldas(char[][] tablero, int altura, int ancho) {
        int contadorceldas = 0;

        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < ancho; columna++) {

                if (tablero[fila][columna] == '-') {
                    int minasalrededor = 0;



                    for (int movifilas = -1; movifilas <= 1; movifilas++) {
                        for (int movicolumns = -1; movicolumns <= 1; movicolumns++) {

                            if (movifilas == 0 && movicolumns == 0) {
                                continue;
                             }

                            int movimientofila = fila + movifilas;

                                int movimientocolumna = columna + movicolumns;


                            if (movimientofila >= 0 && movimientofila < altura
                                    && movimientocolumna >= 0 && movimientocolumna < ancho) {

                                if (tablero[movimientofila][movimientocolumna] == '*') {


                                    
                                    minasalrededor++;
                                }
                             }
                          }
                          }

                    if (minasalrededor >= 6) {


                        contadorceldas++;
                    }
                 }
               }
              }

        return contadorceldas;
    }

    /**
     * Muestra el tablero de minas y espacios libres en la consola de intellj
     * @param tablero matriz del tablero
     * @param altura numero de filas
     * @param ancho numero de columnas
     */

    public static void mostrarTablero(char[][] tablero, int altura, int ancho) {


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
         }
      }

    /**
     * Metodo main donde muestro los mensajes del programa
     * @param args son los argumentos de los lineas de codigo
     */



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Campo de minas ****");

        System.out.println("------------------------");



        System.out.println("introduce el ancho del tablero");
        int ancho = sc.nextInt();

        System.out.println("introduce el alto del tablero");
        int altura = sc.nextInt();
        sc.nextLine();
        char[][] tablero = leerTablero(sc, altura, ancho);
        System.out.println("el tablero se ha cargado correctamente");
        mostrarTablero(tablero, altura, ancho);

        int resultado = contarCeldas(tablero, altura, ancho);


        System.out.println("celdas vacias con al menos 6 minas alrededor " + resultado);
    }
}
