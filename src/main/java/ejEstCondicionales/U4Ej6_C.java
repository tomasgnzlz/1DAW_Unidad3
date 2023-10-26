/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejEstCondicionales;

import java.util.Scanner;

/**
 *
 * @author tomas
 */
public class U4Ej6_C {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("Introduce el lado(cm)");
            int lado = entrada.nextInt();
            double areaCuadrado = (lado * lado);
            System.out.println("El area del cuadrado es: " + areaCuadrado);

        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
            System.out.println("Introduce el cateto1(cm)");
            int cateto1 = entrada.nextInt();
            System.out.println("Introduce el cateto2(cm)");
            int cateto2 = entrada.nextInt();
            double areaTriangulo = ((cateto1 * cateto2) / 2);
            System.out.println("El area del triángulo es: " + areaTriangulo);

        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular el área de un círculo...");
            System.out.println("Introduce el radio(cm)");
            int radio = entrada.nextInt();
            final double PI = 3.14;
            double areaCirculo = ((Math.pow(radio, 2)) * PI);
            System.out.println("El área del círculo es: " + areaCirculo);

        } else if (opcion == 4) {
            System.out.println("Ha seleccionado terminar");
        } else {
            System.out.println("Opción no válida");
        }
    }

}
