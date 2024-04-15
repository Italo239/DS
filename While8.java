/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while8;

/**
 *
 * @author CAMARGO
 */

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanhoLado = twin.nextInt();

        if (tamanhoLado < 1 || tamanhoLado > 20) {
            System.out.println("Tamanho do lado fora do intervalo permitido.");
            return;
        }

        int i = 1;
        while (i <= tamanhoLado) {
            int j = 1;
            while (j <= tamanhoLado) {
                if (i == 1 || i == tamanhoLado || j == 1 || j == tamanhoLado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

        twin.close();
    }
}