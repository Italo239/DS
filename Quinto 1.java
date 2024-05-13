/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinto;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Quinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);
        
        
        int[][] matriz = new int[4][4];
        
        
        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = twin.nextInt();
            }
        }
        
        
        System.out.println("Digite o valor a ser procurado na matriz:");
        int valorProcurado = twin.nextInt();
        
        
        boolean encontrado = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == valorProcurado) {
                    encontrado = true;
                    System.out.println("O valor " + valorProcurado + " foi encontrado na posição [" + i + "][" + j + "]");
                }
            }
        }
        
        
        if (!encontrado) {
            System.out.println("O valor " + valorProcurado + " não foi encontrado na matriz.");
        }
        
        twin.close();
    }
}
