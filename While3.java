/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while3;

/**
 *
 * @author CAMARGO
 */
public class While3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Ímpares: ");
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        
        System.out.println("Pares: ");
        int x = 0;
        while (x < 101) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        }
    }
}
    

