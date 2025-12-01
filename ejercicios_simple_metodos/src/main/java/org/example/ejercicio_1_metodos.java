package org.example;

import java.util.Scanner;

public class ejercicio_1_metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("introduce un numero:");
    int numero = sc.nextInt();
    int resultado = cubo(numero);
    System.out.println("el numero al cubo es: "+resultado);
    }
    public static int cubo (int n) {
        return n*n*n;
    }

}
