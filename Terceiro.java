/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package terceiro;

/**
 *
 * @author CAMARGO
 */
public class Terceiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vetor = {1, 2, 3, 4, 5, 6};
        
        
        for (int i = 0; i < vetor.length / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[vetor.length - 1 - i];
            vetor[vetor.length - 1 - i] = aux;
        }
        
        
        System.out.println("Vetor invertido:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
