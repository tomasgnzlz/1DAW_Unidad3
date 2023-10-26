/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejEstRepeticion;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class U4Ej6_R {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();

        for (int x = 15; x <= n; x += 15) {
            System.out.print(x);
            if (x < n) {
                System.out.print(" - ");
            }
        }
    }
}
