/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while7;

/**
 *
 * @author CAMARGO
 */

import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanhoLado = twin.nextInt();

        if (tamanhoLado < 1 || tamanhoLado > 20) {
            System.out.println("Tamanho do lado fora do intervalo permitido.");
            return;
        }

        int i = 0;
        while (i < tamanhoLado) {
            int j = 0;
            while (j < tamanhoLado) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        twin.close();
    }
}