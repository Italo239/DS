/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.while4;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);

        System.out.println("Quantos alunos têm na sala?");
        int numeroAlunos = twin.nextInt();

        int contador = 0;
        double somaNotas = 0;

        while (contador < numeroAlunos) {
            System.out.println("Entre com a nota do aluno " + (contador + 1) + ":");
            double nota = twin.nextDouble();
            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / numeroAlunos;
        System.out.println("A média da turma é: " + media);

        twin.close();
    }
}
