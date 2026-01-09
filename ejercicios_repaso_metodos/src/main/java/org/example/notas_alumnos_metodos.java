package org.example;

import java.util.Scanner;

public class notas_alumnos_metodos {
    public static double calcular_nota (int a, int b, int c) {
        return (a + b + c) / 3;
    }

    // mostrar menu de lo que se hace //
    public static void mostrarmenu (){
        System.out.println("1 --- introducir nota");
        System.out.println("2 --- Calcular media");
        System.out.println("3 -- Mostrar resultado");
    }
    public static void mostrar_resultado(double media){
        System.out.println("la media de las notas es: "+media);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la nota 1");
        int nota_1 = sc.nextInt();
        System.out.println("introduce la nota 2");
        int nota_2 = sc.nextInt();
        System.out.println("introduce la nota 3");
        int nota_3 = sc.nextInt();

        mostrarmenu();

        double media_nota = calcular_nota(nota_1,nota_2,nota_3);

       mostrar_resultado(media_nota);


    }
}
