package org.example;

import java.util.Scanner;

public class ejercicio_7_recursividad_suma {
    public static int suma_numeros (int numero){
        if (numero == 1){
            System.out.print("1");
            return 1;
        }else {

           int suma = suma_numeros(numero-1);
            System.out.print(" + "+ numero);
            return suma + numero;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero_real = sc.nextInt();
        int resultado = suma_numeros(numero_real);
        System.out.println("la suma total de los numeros es:" +resultado);

    }
}
