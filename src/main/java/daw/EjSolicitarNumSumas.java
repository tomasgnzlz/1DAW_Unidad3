/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import com.sun.source.tree.WhileLoopTree;
import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class EjSolicitarNumSumas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int numeroTotal=0;
        
        do {            
            System.out.println("Introduce un número");
            numero = teclado.nextInt();
            numeroTotal += numero;
            
        } while (numero !=0);
        
        System.out.println("Total: " + numeroTotal);
    }
}
