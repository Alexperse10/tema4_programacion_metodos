package org.example;

import java.util.Scanner;

public class ejercicio_1_recursividad_clase {
    public static int cantidad (int num){
        if (num<10){
            return 1;
        }else {
            return 1 + cantidad(num/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir numero");
        int numero = sc.nextInt();

        int resultado = cantidad(numero);
        System.out.println("la cantidad de digitos que tiene es " +resultado);
    }
}
