/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class U4Ej5_R {

    //5.- Implementa el programa del ejercicio 2 usando un do – while.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;

        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;

        do {
            System.out.print(x);
            if (x < n) {
                System.out.print(" - ");
            }
            x = x + 15; // Sumar 15 en cada iteración
        } while (x <= n);
    }
}
