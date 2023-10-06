/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author tomas 4.- Reescribe el programa del ejercicio 1 usando el operador
 * ternario ?:.
 */
public class U4Ej4_C {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad:");
        int edad = scanner.nextInt();

//                if (edad >= 18) {
//                        System.out.println("Es mayor de edad");
//                } else {
//                        System.out.println("No es mayor de edad");
//                }
        String mayorMenor = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }

}
