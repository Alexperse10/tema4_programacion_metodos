package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int resultado [] = salto_mario.salto_mario_plus();
        System.out.println("salto arriba" +resultado[0]); // es resultado [0] porque es el primer valor del array saltos positivos.
        System.out.println("saltos hacia abajo"+resultado[1]); // es resultado [1] porque es el segundo valor del array saltos negativos.

        boolean resultado_hyperbar = numero_hyperpar.hyperbar();
        if (resultado_hyperbar == true){  // cuidado tiene que poner doble igual para comparar, si pongo un solo igual
            System.out.println("si");
        }else {
            System.out.println("no");
        }
        }

    }
