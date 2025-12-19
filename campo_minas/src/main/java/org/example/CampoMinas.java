package org.example;

import java.util.Scanner;

public class CampoMinas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int ancho;
        String linea;
        System.out.println("**** Campo de minas ****");
        System.out.println("------------------------");
        System.out.println("introduce el ancho del tablero");
        ancho = sc.nextInt();
        System.out.println("introduce el alto del tablero");
        altura = sc.nextInt();
        sc.nextLine();
        char [][]tablero = new char[altura][ancho]; // se realiza en char porque no manejo numeros, manejo caracteres
        // creo la matriz del tablero
        // cada posicion es un caracter


        for (int i=0; i<altura; i++) {
            do {
                System.out.println("introduce la fila: " + (i + 1));
                 linea = sc.nextLine();  // se lee la fila completo
                tablero[i] = linea.toCharArray();  // aqui se convierte la fila en un array de caracteres
                if (linea.length() != ancho) { // valido que la linea no tengas mas caracteres de los que debe


                    System.out.println("Error la fila debe de tener " + ancho + " caracteres");

                }

            }  while (linea.length() != ancho);
        }


        System.out.println("el tablero se ha cargado correctamente");

        for (int i =0; i<altura; i++){  // se muestra el tablero de minas y libre
              for (int j=0; j<ancho; j++){


                  System.out.print(tablero[i][j]);

            }


            System.out.println();
        }
        int contadorceldas =0;
        for (int fila = 0;fila<altura; fila++){  // aqui recorro toda la matriz
              for (int columna = 0; columna<ancho; columna++){
                     if (tablero [fila][columna] == '-'){  // busco el guion que es espacio libre
                    int minasalrededor=0;
                      for (int movifilas = -1; movifilas<=1; movifilas++){
                          for (int movicolumns = -1; movicolumns<=1; movicolumns++){
                            if (movifilas == 0 && movicolumns == 0) {
                                continue;
                            }
                              int movimientofila = fila +movifilas;
                            int movimientocolumna = columna +movicolumns;

                            if (movimientofila >= 0 && movimientofila<altura && movimientocolumna>=0 && movimientocolumna<ancho){
                                   if (tablero[movimientofila][movimientocolumna] == '*'){
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



        System.out.println("celdas vacias con al menos 6 minas alrededor " +contadorceldas );
    }
}
