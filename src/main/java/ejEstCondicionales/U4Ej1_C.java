/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejEstCondicionales;

import java.util.Scanner;

/**
 *
 * @author tomas
 * 1.- Implementa el siguiente programa y realiza ejecuciones para los siguientes 
 * datos de edad: 15,18 y 60. ¿Cuáles son los resultados?
 */
public class U4Ej1_C {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Introduce tu edad:");

                int edad = scanner.nextInt();

                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }

                System.out.print("mostrar la edad: ");
                System.out.println(edad);
        }


}
