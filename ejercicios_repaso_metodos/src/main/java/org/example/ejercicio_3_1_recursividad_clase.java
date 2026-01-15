package org.example;

import java.util.Scanner;

public class ejercicio_3_1_recursividad_clase {
    public static void del_reves_string (String texto){
        char [] letras = texto.toCharArray();
        if (letras.length == 1){
            System.out.println(letras[0]);
        }else {
             System.out.print(letras[letras.length -1]);
             del_reves_string(texto.substring(0, letras.length-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir el numero");
        String texto = sc.nextLine();
        System.out.print("el texto a la inversa es ");
        del_reves_string(texto);
    }
 }
