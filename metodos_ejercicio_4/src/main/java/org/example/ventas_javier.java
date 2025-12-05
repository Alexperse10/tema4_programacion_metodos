package org.example;

import java.util.Scanner;

public class ventas_javier {
    // meto aqui todos los metodos
    public static double [] recaudacion_dia () { // cuando pones [] es que ese metodo devuelve un vector
        Scanner sc = new Scanner(System.in);
        double [] semana = new double[6]; // creo el vector semana con un tamaño de 6 numeros

        for (int i =0; i<semana.length; i++){ // para rellenar el vector utilizo un for donde pregunto que introduzca los valores
            System.out.println("introduce la recaudacion del dia "+i);
            semana[i] = sc.nextDouble();
        }
        return semana;
        }

    public static int maxventas (double[] semana){
        int diamax=0;
        double max = semana [0];
        for (int i =0; i<semana.length; i++){
            if (semana[i]>max){
                max = semana[i];
                diamax =i;
            }
        }
        return diamax;
    }

    public static int minventas (double[] semana){
        int diamin=0;
        double min = semana[0];
        for (int i =0; i<semana.length; i++){
            if (semana[i]<min){
                min = semana[i];
                diamin =i;
            }
        }
        return diamin;
    }

    public static double media_semanal (double[] semana){
        double media;
        double suma =0;
        for (int i =0; i<semana.length; i++){
            suma += semana[i];
        }
        media = suma/semana.length;
        return media;
    }

    public static double recaudacion_domingo (double[] semana){
        return semana[5];
    }

    public static String nombredia (int dia){
        switch (dia){
            case 0:
                return "martes";
            case 1:
                return "miercoles";
            case 2:
                return "jueves";
            case 3:
                return "viernes";
            case 4:
                return "sabado";
            case 5:
                return "domingo";
            default:
                return "dia invalido";
        }
    }

}

