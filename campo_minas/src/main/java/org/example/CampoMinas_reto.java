package org.example;

import java.util.Scanner;

public class CampoMinas_reto {

    public static char[][] leerTablero(Scanner sc, int altura, int ancho) {
        char[][] tablero = new char[altura][ancho];

        for (int i = 0; i < altura; i++) {
            String linea = sc.nextLine();
            tablero[i] = linea.toCharArray();
        }

        return tablero;
    }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int ancho = sc.nextInt();
            int altura = sc.nextInt();
            sc.nextLine();

            if (ancho == 0 || altura == 0) {
                break;
            }

            char[][] tablero = leerTablero(sc, altura, ancho);
            int resultado = contarCeldas(tablero, altura, ancho);

            System.out.println(resultado);
        }
    }
}
