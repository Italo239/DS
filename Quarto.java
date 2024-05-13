/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quarto;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Quarto {

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
        
        
        int menorValor = matriz[0][0];
        int maiorValor = matriz[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }
        
        
        System.out.println("O menor valor na matriz é: " + menorValor);
        System.out.println("O maior valor na matriz é: " + maiorValor);
        
        twin.close();
    }
}
