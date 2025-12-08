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
        sc.nextLine();
        int[][] kilos_oliva = new int[largo][ancho];

        for (int i =0; i<largo; i++){ // aqui registra filas

            while (true) {  // bucle de validacion de fila
                System.out.println("introduce " +ancho+ "valores para la fila" +(i+1)+ "separados por espacios");
                String linea = sc.nextLine();
                String [] partes = linea.split(" "); // introduce 4 valores por fila separados por espacios

                if (partes.length != ancho ) {  // aqui compruebas que el usuario ha escrito la cantidad de valores correctos
                    System.out.println("Error deben de ser exactamente" +ancho + "valores");
                    continue; // hace que vuelva al principio del while, es decir vuelve a pedir la misma fila otra vez.
                }
                boolean filavalida = true;

                for (int j =0; j<ancho; j++) {
                    try {  // introduzco un try and catch para evitar que se introduzcan palabras
                        int valor = Integer.parseInt(partes[j]);  // aqui lo que hago es convertir a numero las partes
                        if (valor > 50 || valor <1){
                            System.out.println("ERROR introduce un valor valido");
                            filavalida = false;
                            break;
                        }
                        kilos_oliva[i][j] = valor;
                    }catch (NumberFormatException e) {
                        System.out.println("ERROR valor incorrecto");
                        filavalida = false;
                        break;
                    }
                }
                if (filavalida) break;
            }

        }
        for (int i =0; i <largo; i++){
            for (int j =0; j<ancho; j++){
                System.out.print(kilos_oliva [i][j] + " ");

            }
            System.out.println();
        }
        int suma =0;
        int totallitros;
        for (int i=0; i<largo; i++){
            for (int j =0; j<ancho; j++){
                suma += kilos_oliva [i][j];
            }
        }
        totallitros = suma/8;
        System.out.println("la suma total de los kilos son " +suma);
        System.out.println("los litros totales de oliva son: "+totallitros);

        for (int i =0; i<largo; i++){
            int suma_hilera = 0;
            for (int j=0; j<ancho; j++){

                suma_hilera += kilos_oliva[i][j];

            }
            System.out.println("la suma de la hilera "+(i+1)+ " son: "+suma_hilera+ " y los litro son: "  +(double)(suma_hilera/8));

        }
        for (int i =0; i<largo; i++){
            for (int j =0; j<ancho; j++){
                if (kilos_oliva [i][j]> 35){
                    System.out.println("los olivos que han producido mas de 35 kg estan en la pos ("+(i+1)+" , "+(j+1));

                }
            }
        }
        int max_productivo =0;
        int fila_max=0;
        int columna_max=0;

        for (int i =0; i<largo; i++){
            for (int j =0; j<ancho; j++){
                if (kilos_oliva[i][j]>max_productivo){
                    max_productivo = kilos_oliva [i][j];
                    fila_max =i;
                    columna_max=j;

                    }else if (kilos_oliva[i][j] == max_productivo && i<fila_max){
                    fila_max =i;
                    columna_max =j;

                }

            }

        }
        System.out.println("el olivo top tiene "+max_productivo+ " esta en la posicion(" +fila_max+ ", "+columna_max );


    }
}
