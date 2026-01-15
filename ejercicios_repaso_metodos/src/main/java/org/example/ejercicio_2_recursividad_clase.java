package org.example;

import java.util.Scanner;

public class ejercicio_2_recursividad_clase {
    public static int exponente (int base_, int exponente_){
        if (base_ < 0 || exponente_< 0){
            System.out.println("Error las variables deben ser positivas ");
            return -1;
        } else if (exponente_ == 0) {
            return 1;

        }else {
            return base_ * exponente(base_,exponente_-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero base ");
        int base = sc.nextInt();

        System.out.println("introduce un exponente");
        int exponente = sc.nextInt();
    }
}
