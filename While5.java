/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while5;

/**
 *
 * @author CAMARGO
 */

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);

        int contador = 0;
        int maior = Integer.MIN_VALUE;

        while (contador < 10) {
            System.out.println("Digite um número:");
            int numero = twin.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            contador++;
        }

        System.out.println("O maior número digitado é: " + maior);

        twin.close();
    }
}