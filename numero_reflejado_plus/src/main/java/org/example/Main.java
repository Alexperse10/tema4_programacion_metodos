package org.example;

import java.util.Scanner;

import static org.example.numero_reflejado.numero_reflex;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>=0){
            int invertido = numero_reflex(n);
            if (invertido == n/2){
                System.out.println("si");
            }else {
                System.out.println("no");
            }
            n =sc.nextInt(); 
        }
    }
}