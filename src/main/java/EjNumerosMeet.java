
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class EjNumerosMeet {
    public static void main(String[] args) {
        //Solicitar al usuario un número concreto de números que debe introducir. 
        //El programa pedirá al usuario esa cantidad de números, uno a uno, 
        //y dirá si el número introducido es par, impar. 
        //Al terminar debe calcular la media aritmética.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuanto numeros quieres meter?");
        int num = teclado.nextInt();
        int total =0;
        int numeros = 0;
        for (int i = 0; i <= num; i++) {
            System.out.println("Introduce el " + i + " num");
            numeros = teclado.nextInt();
            total += numeros;
            String PArImpar = (numeros % 2 == 0)? "Par": "Impar";
        }
        
        double media = (double)total/num;
        System.out.println("Media: " + media);
    }
    
}
