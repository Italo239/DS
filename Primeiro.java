/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiro;

/**
 *
 * @author CAMARGO
 */


    /**
     * @param args the command line arguments
     */
    import java.util.Scanner;

    public class Primeiro {

    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);
        
        
        int[] vetor = new int[10];
        
       
        System.out.println("Digite os 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = twin.nextInt();
        }
        
        
        int menorValor = vetor[0];
        
        
        for (int i = 1; i < 10; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        
        
        System.out.println("O menor valor é: " + menorValor);
        
        twin.close();
    }
}
    

