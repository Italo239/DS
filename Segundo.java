/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundo;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class Segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner twin = new Scanner(System.in);
        
        
        int[] vetor = new int[10];
        
        
        System.out.println("Digite os 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = twin.nextInt();
        }
        
        
        System.out.println("Digite o numero a ser procurado:");
        int numeroProcurado = twin.nextInt();
        
        
        boolean encontrado = false;
        int posicao = 1;
        for (int i = 1; i < 10; i++) {
            if (vetor[i] == numeroProcurado) {
                encontrado = true;
                posicao = i;
                break;
            }
        }
        
       
        if (encontrado) {
            System.out.println("O numero " + numeroProcurado + " foi encontrado na posição " + (posicao));
        } else {
            System.out.println("O numero " + numeroProcurado + " não foi encontrado no vetor.");
        }
        
        twin.close();
    }
}
