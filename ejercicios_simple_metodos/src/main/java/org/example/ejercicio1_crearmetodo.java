package org.example;

public class ejercicio1_crearmetodo {

    public static void main(String[] args) {
        saludar();
        int resultado = sumar(5, 3);
        System.out.println("el resultad de la suma es " + resultado);
        int resultadomultiplicar = pordiez(7);
        System.out.println("el resultado de la multiplicacion es" + resultadomultiplicar);
        imprimirnombre("alex");
        boolean par = espar(8);
        System.out.println("el numero es " + par);
        char letra = primeraletra("java");
        System.out.println("la primera letra es" + letra);
        int cantidad = contarletras("programacion");
        System.out.println("la palabra" + cantidad + "letra");
        int contar_vocales =  contarvocales ("alejandro");
        System.out.println("el numero de vocales es" +contar_vocales);
    }

    public static void saludar() {
        System.out.println("hola desde un metodo");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int pordiez(int n) {
        return n * 10;
    }

    public static void imprimirnombre(String nombre) {
        System.out.println("tu nombre es:" + nombre);
    }

    public static boolean espar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static char primeraletra(String palabra) {
        return palabra.charAt(0);
    }

    public static int contarletras(String palabra) {
        return palabra.length();
    }

    public static int contarvocales(String palabra) {
        int contador = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
}

