package org.example;

import java.util.Scanner;

public class numero_hyperpar {
    public static boolean hyperbar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("introducir un numero");
        int numero = sc.nextInt();
        boolean eshyperpar =true;
        String acumulador = "";
        String numero_string = Integer.toString(numero);
        for (int i =0; i<numero_string.length(); i++) {
            char numero_string_plus = numero_string.charAt(i);  // acordarse que cuando cogemos un caracter es un char
            if (numero_string_plus =='0' || numero_string_plus == '2' || numero_string_plus == '4' || numero_string_plus == '6' || numero_string_plus == '8'){
                eshyperpar = true;

            }else{
                eshyperpar =false;
                break;
            }
        }
        return eshyperpar;
    }

}
