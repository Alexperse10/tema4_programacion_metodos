package org.example;

import java.util.Scanner;

import static org.example.ventas_javier.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] arg) {

        double [] semana = recaudacion_dia(); // se llama al metodo para obtener las ventas de la semana

        // calculamos los resultado
        int diamax = maxventas(semana);
        int diamin = minventas(semana);
        double media = media_semanal(semana);
        double recaudacion_domingo = recaudacion_domingo(semana);

        //mostrar resultados

        System.out.println("dia con mas ventas "+nombredia(diamax));
        System.out.println("dia con menos ventas " +nombredia(diamin));
        System.out.println("la media semanal es" +media);
        System.out.println("la recaudacion del domingo es" +recaudacion_domingo);

        if (recaudacion_domingo>media){
            System.out.println("si");
        }else {
            System.out.println("no");
        }
    }

    }
