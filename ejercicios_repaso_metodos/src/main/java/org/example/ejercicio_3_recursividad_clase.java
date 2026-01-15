package org.example;

import java.util.Scanner;

public class ejercicio_3_recursividad_clase {
    public static void del_reves (int numero){

        if (numero < 10){
            System.out.println(numero);
        }else {
            System.out.print(numero%10);
            del_reves(numero/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero");
        int numero = sc.nextInt();
        System.out.print("el numero del reves es:");
        del_reves(numero);

    }
}
