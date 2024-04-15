/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while6;

/**
 *
 * @author CAMARGO
 */

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);

        int contador = 0;
        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.println("Digite um número:");
            int numero = twin.nextInt();
            
            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero;
            } else if (numero > maior2) {
                maior2 = numero;
            }
            
            contador++;
        }

        System.out.println("Os dois maiores números digitados são: " + maior1 + " e " + maior2);

        twin.close();
    }
}