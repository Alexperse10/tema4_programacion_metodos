package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        menu.mostrarmenu();

        System.out.println("elige una opcion");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            int r = operaciones.sumar(5,3);
            System.out.println("resultado de sumar " +r);
        }

        else if(opcion ==2) {
            int r = operaciones.cubo(4);
            System.out.println("El cubo de 4 es:" +r);
        }
        else if (opcion == 3) {
            System.out.println("Introduce una palabra");
            String palabra = sc.nextLine();
            String may = cadenautils.aMauyusculas(palabra);
            System.out.println("en mayusculas: "+may);
            System.out.println("vocales: "+cadenautils.contarvocales(may));

        } else if (opcion == 4) {
            System.out.println("saliendo...");
        }else {
            System.out.println("opcion no valido");
        }
        System.out.println("introduce un numero");
        int numero_triple = sc.nextInt();
        int resultado = metodo_triple.triple(numero_triple);  //estas llamando al metodo triple que esta en la calse metodo_triple
        System.out.println("el triple es: "+resultado);  // y le estas enviando el numero que escribio el usuario
    }

    }
