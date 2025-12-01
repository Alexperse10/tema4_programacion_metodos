package org.example;

import java.util.Scanner;

public class ejercicio_2_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas opciones quieres");
        int n = sc.nextInt();
        mostrarmenu(n);
        System.out.println("elige una opcion");
        int opcion = sc.nextInt();

    }

    public static void mostrarmenu(int n){
        for (int i =1; i<n-1; i++){
            System.out.println(i + ". Opcion" +i);
        }
        System.out.println(n +"salir");
    }
}
